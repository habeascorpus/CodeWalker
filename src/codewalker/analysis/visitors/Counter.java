package codewalker.analysis.visitors;

import org.eclipse.jdt.core.dom.CompilationUnit;

public class Counter extends BaseVisitor {
    
    @Override
    public boolean visit(CompilationUnit node)
    {
	node.getClass().to
    }

}
