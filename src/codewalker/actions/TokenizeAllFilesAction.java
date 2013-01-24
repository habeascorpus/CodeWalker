package codewalker.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import codewalker.ConfigurationSettings;
import codewalker.analysis.FileListGenerator;
import codewalker.analysis.FileTokenizer;

public class TokenizeAllFilesAction implements IWorkbenchWindowActionDelegate {

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
		    String[] tokens = (new FileTokenizer(cu)).tokenize();
		    String absPath = cu.getPath().toFile().getAbsolutePath();
		    File tokenOutputFile = new File(ConfigurationSettings.tokenDirectory, absPath);
		    File tokenOutputDirectory = tokenOutputFile.getParentFile();
		    if (!tokenOutputDirectory.isDirectory())
			if (!tokenOutputDirectory.mkdirs())
			    throw new RuntimeException();
		    PrintStream ps = new PrintStream(tokenOutputFile);
		    for (final String token : tokens)
			ps.println(token);
		}
		catch (InvalidInputException iie)
		{
		    System.err.println("Skipping file " + cu.getPath().toFile().getAbsolutePath());
		}
		catch (FileNotFoundException fnfe)
		{
		    System.err.println("Cannot open token file for " + cu.getPath().toFile().getAbsolutePath());
		}
		catch (RuntimeException te)
		{
		    System.err.println("Cannot create output directory for " + cu.getPath().toFile().getAbsolutePath());
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
