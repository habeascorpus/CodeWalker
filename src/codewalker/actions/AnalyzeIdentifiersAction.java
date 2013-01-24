package codewalker.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import codewalker.ConfigurationSettings;
import codewalker.analysis.FileListGenerator;
import codewalker.analysis.IdentifierAnalyzer;

public class AnalyzeIdentifiersAction implements IWorkbenchWindowActionDelegate {

    @Override
    public void run(IAction action) {
	FileListGenerator flg = new FileListGenerator(System.out);
	try
	{
	    ICompilationUnit[] compilationUnits = flg.getFiles();
	    
	    for (final ICompilationUnit cu : compilationUnits)
	    {
		try
		{
		    String[] identifiers = (new IdentifierAnalyzer(cu)).getIdentifiers();
		    String absPath = cu.getPath().toFile().getAbsolutePath();
		    File identifierOutputFile = new File(ConfigurationSettings.identifierDirectory, absPath);
		    File identifierOutputDirectory = identifierOutputFile.getParentFile();
		    if (!identifierOutputDirectory.isDirectory())
			if (!identifierOutputDirectory.mkdirs())
			    throw new RuntimeException();
		    PrintStream ps = new PrintStream(identifierOutputFile);
		    for (final String id : identifiers)
			ps.println(id);
		}
		catch (FileNotFoundException fnfe)
		{
		    System.err.println("Cannot open identifier file for " + cu.getPath().toFile().getAbsolutePath());
		}
	    }
	}
	catch (JavaModelException jme)
	{
	    System.err.println("Caught JavaModelException");
	}
	catch (CoreException ce)
	{
	    System.err.println("Caught CoreException");
	}
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public void init(IWorkbenchWindow window) {
    }

}