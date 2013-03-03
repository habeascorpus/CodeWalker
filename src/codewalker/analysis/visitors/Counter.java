package codewalker.analysis.visitors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;

import codewalker.analysis.NodeSymbolConverter;

public class Counter extends BaseVisitor {
    
    private Map<String, Integer> counts = new HashMap<>();
    
    @Override
    public void preVisit(ASTNode node)
    {
	String nodeType = NodeSymbolConverter.convertToString(node.getNodeType());
	List<ASTNode> children = getNodeChildren(node);
	String childrenTypes = childrenToString(children);
	String production = nodeType + " -> " + childrenTypes;
	
	if (counts.containsKey(production))
	{
	    int c = counts.get(production);
	    counts.put(production, c + 1);
	}
	else
	{
	    counts.put(production, 1);
	}
    }
    
    public static List<ASTNode> getNodeChildren(ASTNode node)
    {
	List<ASTNode> children = new ArrayList<>();
	List properties = node.structuralPropertiesForType();
	for (int i = 0; i < properties.size(); i++)
	{
	    StructuralPropertyDescriptor prop = (StructuralPropertyDescriptor) properties.get(i);
	    if (prop.isChildProperty())
	    {
		ASTNode child = (ASTNode) node.getStructuralProperty(prop);
		if (child != null)
		    children.add(child);
	    }
	    else if (prop.isChildListProperty())
	    {
		List<ASTNode> theseChildren = (List<ASTNode>) node.getStructuralProperty(prop);
		if (theseChildren != null)
		    children.addAll(theseChildren);
	    }
	}
	return children;
    }
    
    public static String childrenToString(List<ASTNode> children)
    {
	StringBuilder sb = new StringBuilder();
	for (final ASTNode child : children)
	{
	    String nodeType = NodeSymbolConverter.convertToString(child.getNodeType());
	    sb.append(nodeType + " ");
	}
	return sb.toString();
    }
    
    public String toString()
    {
	StringBuilder sb = new StringBuilder();
	for (final String nodeType : counts.keySet())
	    sb.append(nodeType + "\t" + counts.get(nodeType) + "\n");
	return sb.toString();
    }

}
