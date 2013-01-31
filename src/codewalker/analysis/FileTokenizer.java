package codewalker.analysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.compiler.IScanner;
import org.eclipse.jdt.core.compiler.ITerminalSymbols;
import org.eclipse.jdt.core.compiler.InvalidInputException;

/**
 * Tokenizes a single Java file.
 * 
 * @author pschulam
 *
 */
public class FileTokenizer {
    private final ICompilationUnit cu;
    
    public FileTokenizer(ICompilationUnit cu)
    {
	this.cu = cu;
    }
    
    /**
     * Tokenize the compilation unit that was passed to the constructor
     * of this object.
     * 
     * @return an array of strings containing the tokens of the source file
     */
    public String[] tokenize() throws JavaModelException, InvalidInputException
    {
	String rawSource = this.cu.getSource();
	IScanner scanner = ToolFactory.createScanner(false, false, false, "1.5");
	scanner.setSource(rawSource.toCharArray());
	
	int token;
	List<String> tokens = new ArrayList<String>();
	while ((token = scanner.getNextToken()) != ITerminalSymbols.TokenNameEOF)
	{
	    char[] tokenSource = scanner.getCurrentTokenSource();
	    String tokenStr = (new String(tokenSource)).replace('\n', ' ').replace('\t', ' ');
	    String tokenInfo = tokenStr + '\t' + TerminalSymbolConverter.convertToString(token);
	    tokens.add(tokenInfo);
	}
	return tokens.toArray(new String[0]);
    }
}
