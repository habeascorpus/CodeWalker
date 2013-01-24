package codewalker.analysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.SimpleName;

import codewalker.analysis.visitors.SimpleNameVisitor;

/**
 * Analyzes the identifiers used in a Java file. This includes
 * binding information, declaration information, etc.
 * 
 * @author pschulam
 *
 */
public class IdentifierAnalyzer {
    private static final int NO_BINDING = -1;
    
    private final ICompilationUnit cu;
    
    public IdentifierAnalyzer(ICompilationUnit cu)
    {
	this.cu = cu;
    }
    
    public String[] getIdentifiers()
    {
	CompilationUnit parse = parse();
	SimpleNameVisitor visitor = new SimpleNameVisitor();
	parse.accept(visitor);
	
	List<String> identifiers = new ArrayList<>();
	for (SimpleName sn : visitor.getSimpleNames())
	    identifiers.add(simpleNameToString(sn));
	return identifiers.toArray(new String[0]);
    }
    
    private String simpleNameToString(SimpleName node)
    {
	String identifier = node.getIdentifier();
	boolean isDeclaration = node.isDeclaration();
	IBinding entityBinding = node.resolveBinding();
	String binding;
	if (entityBinding == null)
	    binding = BindingConverter.bindingToString(NO_BINDING);
	else
	    binding = BindingConverter.bindingToString(entityBinding.getKind());
	return identifier + '\t' + binding + '\t' + isDeclaration;
    }
    
    private CompilationUnit parse()
    {
	ASTParser parser = ASTParser.newParser(AST.JLS3);
	parser.setKind(ASTParser.K_COMPILATION_UNIT);
	parser.setSource(this.cu);
	parser.setResolveBindings(true);
	return (CompilationUnit) parser.createAST(null);
    }

}
