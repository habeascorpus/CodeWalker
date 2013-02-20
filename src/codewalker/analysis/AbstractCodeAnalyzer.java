package codewalker.analysis;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public abstract class AbstractCodeAnalyzer {
    protected ICompilationUnit cu;
    
    public AbstractCodeAnalyzer(ICompilationUnit cu)
    {
	this.cu = cu;
    }
    
    protected String getCompilationUnitSource() throws JavaModelException
    {
	return this.cu.getSource();
    }
    
    protected CompilationUnit parse()
    {
	ASTParser parser = ASTParser.newParser(AST.JLS3);
	parser.setKind(ASTParser.K_COMPILATION_UNIT);
	parser.setSource(this.cu);
	parser.setResolveBindings(true);
	return (CompilationUnit) parser.createAST(null);
    }

}
