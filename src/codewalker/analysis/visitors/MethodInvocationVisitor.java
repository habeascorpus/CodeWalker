package codewalker.analysis.visitors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodInvocation;

public class MethodInvocationVisitor extends ASTVisitor {
    private List<MethodInvocation> invocations = new ArrayList<>();
    
    @Override
    public boolean visit(MethodInvocation node)
    {
	invocations.add(node);
	return super.visit(node);
    }
    
    public List<MethodInvocation> getMethodInvocations()
    {
	return invocations;
    }
    
}
