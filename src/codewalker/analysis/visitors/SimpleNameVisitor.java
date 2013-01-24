package codewalker.analysis.visitors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SimpleName;

public class SimpleNameVisitor extends ASTVisitor {
    private List<SimpleName> names = new ArrayList<>();
    
    @Override
    public boolean visit(SimpleName node)
    {
	names.add(node);
	return super.visit(node);
    }
    
    public List<SimpleName> getSimpleNames()
    {
	return names;
    }

}
