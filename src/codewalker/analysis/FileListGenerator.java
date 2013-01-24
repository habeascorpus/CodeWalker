package codewalker.analysis;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import codewalker.ConfigurationSettings;

/**
 * Generates or prints the list of all Java files in the workspace.
 * 
 * @author pschulam
 *
 */
public class FileListGenerator {
    private final PrintStream ps;
    
    public FileListGenerator(PrintStream ps)
    {
	this.ps = ps;
    }
    
    /**
     * Get an array of the absolute paths (with respect to the workspace) of 
     * all Java files from the projects listed in ConfigurationSettings.
     * 
     * @return Array of absolute paths to Java files
     * @throws CoreException
     * @throws JavaModelException
     */
    public ICompilationUnit[] getFiles() throws CoreException, JavaModelException
    {
	List<ICompilationUnit> files = new ArrayList<ICompilationUnit>();
	for (final String projectName : ConfigurationSettings.projects)
	{
	    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	    if (project.isNatureEnabled("org.eclipse.jdt.core.javanature"))
	    {
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragment[] packages = javaProject.getPackageFragments();
		for (IPackageFragment p : packages)
		    if (p.getKind() == IPackageFragmentRoot.K_SOURCE)
			files.addAll(packageFiles(p));
	    }
	}
	return files.toArray(new ICompilationUnit[0]);
    }
    
    /**
     * Print the absolute paths (with respect to the workspace) of
     * all Java files to the PrintStream with which this object was
     * created.
     * 
     * @throws CoreException
     * @throws JavaModelException
     */
    public void printFiles() throws CoreException, JavaModelException
    {
	for (final String projectName : ConfigurationSettings.projects)
	{
	    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	    if (project.isNatureEnabled("org.eclipse.jdt.core.javanature"))
	    {
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragment[] packages = javaProject.getPackageFragments();
		for (IPackageFragment p : packages)
		    if (p.getKind() == IPackageFragmentRoot.K_SOURCE)
			for (final ICompilationUnit cu : packageFiles(p))
			    this.ps.println(compilationUnitPath(cu));
	    }
	}
    }
    
    /**
     * Return the absolute paths of all Java files in package <code>p</code>.
     * 
     * @param p
     * @return
     * @throws JavaModelException
     */
    private List<ICompilationUnit> packageFiles(IPackageFragment p) throws JavaModelException
    {
	List<ICompilationUnit> files = new ArrayList<ICompilationUnit>();
	ICompilationUnit[] compilationUnits = p.getCompilationUnits();
	for (ICompilationUnit cu : compilationUnits)
	{
	    files.add(cu);
	}
	return files;
    }
    
    /**
     * Retrieve the absolute path of an ICompilationUnit.
     * 
     * @param a string containing the absolute path
     * @return
     */
    private static String compilationUnitPath(ICompilationUnit cu)
    {
	return cu.getPath().toFile().getAbsolutePath();
    }
}
