package codewalker.actions;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import codewalker.ConfigurationSettings;
import codewalker.analysis.FileListGenerator;

public class GenerateFileListAction implements IWorkbenchWindowActionDelegate {

    @Override
    public void run(IAction action) {
	PrintStream ps = null;
	
	try
	{
	    ps = new PrintStream(ConfigurationSettings.fileList);
	    FileListGenerator flg = new FileListGenerator(ps);
	    flg.printFiles();
	}
	catch (FileNotFoundException fnfe)
	{
	    System.err.println("Cannot create file list " + ConfigurationSettings.fileList.toString());
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
