package codewalker.analysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;

import codewalker.analysis.visitors.MethodInvocationVisitor;

public class MethodInvocationCollector extends AbstractCodeAnalyzer {
    
    public MethodInvocationCollector(ICompilationUnit cu)
    {
	super(cu);
    }
    
    public String[] getMethodInvocations() throws JavaModelException
    {
	CompilationUnit parse = parse();
	MethodInvocationVisitor visitor = new MethodInvocationVisitor();
	parse.accept(visitor);
	
	List<String> invocations = new ArrayList<>();
	for (final MethodInvocation mi : visitor.getMethodInvocations())
	{
	    IMethodBinding methodBinding = mi.resolveMethodBinding();
	    ITypeBinding typeBinding = null;
	    if (methodBinding != null)
		typeBinding = methodBinding.getDeclaringClass();
	    String typeName;
	    if (typeBinding == null)
		typeName = "UNRESOLVED";
	    else
		typeName = typeBinding.getQualifiedName();
	    invocations.add(typeName + '\t' + methodInvocationText(mi));
	}
	
	return invocations.toArray(new String[0]);
    }
    
    private String methodInvocationText(MethodInvocation mi) throws JavaModelException
    {
	String source = getCompilationUnitSource();
	int start = mi.getStartPosition();
	int length = mi.getLength();
	return source.substring(start, start+length).replaceAll("\\s+", " ");
    }
}
