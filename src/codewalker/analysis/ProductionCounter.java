package codewalker.analysis;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.CompilationUnit;

import codewalker.analysis.visitors.Counter;

public class ProductionCounter extends AbstractCodeAnalyzer {
    private Counter counter = new Counter();
    
    public ProductionCounter(ICompilationUnit cu)
    {
	super(cu);
	CompilationUnit parse = parse();
	parse.accept(counter);
    }
    
    public String toString()
    {
	return counter.toString();
    }

}
