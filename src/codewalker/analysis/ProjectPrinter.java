package codewalker.analysis;

import java.io.PrintStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

/**
 *  Prints information about each project in the workspace.
 * 
 * @author pschulam
 *
 */
public class ProjectPrinter {
    private final PrintStream ps;
    
    public ProjectPrinter(PrintStream ps)
    {
	this.ps = ps;
	
	IWorkspace workspace = ResourcesPlugin.getWorkspace();
	IWorkspaceRoot root = workspace.getRoot();
	IProject[] projects = root.getProjects();
	
	for (final IProject project : projects)
	{
	    try
	    {
		printProjectInfo(project);
	    }
	    catch (Exception e)
	    {
		e.printStackTrace();
		System.exit(1);
	    }
	}
    }
    
    private void printProjectInfo(IProject project)
	    throws CoreException, JavaModelException
    {
	this.ps.println("Working in project " + project.getName());
	if (project.isNatureEnabled("org.eclipse.jdt.core.javanature"))
	{
	    IJavaProject javaProject = JavaCore.create(project);
	    this.ps.println(javaProject.getPath());
	    
	    IPackageFragment[] packages = javaProject.getPackageFragments();
	    int numSourceFiles = 0;
	    for (IPackageFragment myPackage : packages)
	    {
		if (myPackage.getKind() == IPackageFragmentRoot.K_SOURCE)
		{
		    ICompilationUnit[] compilationUnits = myPackage.getCompilationUnits();
		    for (ICompilationUnit cu : compilationUnits)
		    {
			this.ps.println(cu.getElementName());
			numSourceFiles++;
		    }
		}
	    }
	    this.ps.println("Found " + numSourceFiles + " source files");
	}
    }
}
