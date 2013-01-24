package codewalker.analysis;

import org.eclipse.jdt.core.compiler.ITerminalSymbols;

/**
 * Converts terminal symbols to various formats (just strings for now).
 * 
 * @author pschulam
 *
 */
public class TerminalSymbolConverter {

    /**
     * Get the string representation of a terminal symbol.
     * 
     * @param the string representation of <code>token</code>
     * @return
     */
    public static String convertToString(int token)
    {
	String tokenString;
	switch (token) {
	case ITerminalSymbols.TokenNameabstract:
	    tokenString = "TokenNameabstract";
	    break;
	case ITerminalSymbols.TokenNameAND:
	    tokenString = "TokenNameAND";
	    break;
	case ITerminalSymbols.TokenNameAND_AND:
	    tokenString = "TokenNameAND_AND";
	    break;
	case ITerminalSymbols.TokenNameAND_EQUAL:
	    tokenString = "TokenNameAND_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameassert:
	    tokenString = "TokenNameassert";
	    break;
	case ITerminalSymbols.TokenNameAT:
	    tokenString = "TokenNameAT";
	    break;
	case ITerminalSymbols.TokenNameboolean:
	    tokenString = "TokenNameboolean";
	    break;
	case ITerminalSymbols.TokenNamebreak:
	    tokenString = "TokenNamebreak";
	    break;
	case ITerminalSymbols.TokenNamebyte:
	    tokenString = "TokenNamebyte";
	    break;
	case ITerminalSymbols.TokenNamecase:
	    tokenString = "TokenNamecase";
	    break;
	case ITerminalSymbols.TokenNamecatch:
	    tokenString = "TokenNamecatch";
	    break;
	case ITerminalSymbols.TokenNamechar:
	    tokenString = "TokenNamechar";
	    break;
	case ITerminalSymbols.TokenNameCharacterLiteral:
	    tokenString = "TokenNameCharacterLiteral";
	    break;
	case ITerminalSymbols.TokenNameclass:
	    tokenString = "TokenNameclass";
	    break;
	case ITerminalSymbols.TokenNameCOLON:
	    tokenString = "TokenNameCOLON";
	    break;
	case ITerminalSymbols.TokenNameCOMMA:
	    tokenString = "TokenNameCOMMA";
	    break;
	case ITerminalSymbols.TokenNameCOMMENT_BLOCK:
	    tokenString = "TokenNameCOMMENT_BLOCK";
	    break;
	case ITerminalSymbols.TokenNameCOMMENT_JAVADOC:
	    tokenString = "TokenNameCOMMENT_JAVADOC";
	    break;
	case ITerminalSymbols.TokenNameCOMMENT_LINE:
	    tokenString = "TokenNameCOMMENT_LINE";
	    break;
	case ITerminalSymbols.TokenNameconst:
	    tokenString = "TokenNameconst";
	    break;
	case ITerminalSymbols.TokenNamecontinue:
	    tokenString = "TokenNamecontinue";
	    break;
	case ITerminalSymbols.TokenNamedefault:
	    tokenString = "TokenNamedefault";
	    break;
	case ITerminalSymbols.TokenNameDIVIDE:
	    tokenString = "TokenNameDIVIDE";
	    break;
	case ITerminalSymbols.TokenNameDIVIDE_EQUAL:
	    tokenString = "TokenNameDIVIDE_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamedo:
	    tokenString = "TokenNamedo";
	    break;
	case ITerminalSymbols.TokenNameDOT:
	    tokenString = "TokenNameDOT";
	    break;
	case ITerminalSymbols.TokenNamedouble:
	    tokenString = "TokenNamedouble";
	    break;
	case ITerminalSymbols.TokenNameDoubleLiteral:
	    tokenString = "TokenNameDoubleLiteral";
	    break;
	case ITerminalSymbols.TokenNameELLIPSIS:
	    tokenString = "TokenNameELLIPSIS";
	    break;
	case ITerminalSymbols.TokenNameelse:
	    tokenString = "TokenNameelse";
	    break;
	case ITerminalSymbols.TokenNameenum:
	    tokenString = "TokenNameenum";
	    break;
	case ITerminalSymbols.TokenNameEOF:
	    tokenString = "TokenNameEOF";
	    break;
	case ITerminalSymbols.TokenNameEQUAL:
	    tokenString = "TokenNameEQUAL";
	    break;
	case ITerminalSymbols.TokenNameEQUAL_EQUAL:
	    tokenString = "TokenNameEQUAL_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameERROR:
	    tokenString = "TokenNameERROR";
	    break;
	case ITerminalSymbols.TokenNameextends:
	    tokenString = "TokenNameextends";
	    break;
	case ITerminalSymbols.TokenNamefalse:
	    tokenString = "TokenNamefalse";
	    break;
	case ITerminalSymbols.TokenNamefinal:
	    tokenString = "TokenNamefinal";
	    break;
	case ITerminalSymbols.TokenNamefinally:
	    tokenString = "TokenNamefinally";
	    break;
	case ITerminalSymbols.TokenNamefloat:
	    tokenString = "TokenNamefloat";
	    break;
	case ITerminalSymbols.TokenNameFloatingPointLiteral:
	    tokenString = "TokenNameFloatingPointLiteral";
	    break;
	case ITerminalSymbols.TokenNamefor:
	    tokenString = "TokenNamefor";
	    break;
	case ITerminalSymbols.TokenNamegoto:
	    tokenString = "TokenNamegoto";
	    break;
	case ITerminalSymbols.TokenNameGREATER:
	    tokenString = "TokenNameGREATER";
	    break;
	case ITerminalSymbols.TokenNameGREATER_EQUAL:
	    tokenString = "TokenNameGREATER_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameIdentifier:
	    tokenString = "TokenNameIdentifier";
	    break;
	case ITerminalSymbols.TokenNameif:
	    tokenString = "TokenNameif";
	    break;
	case ITerminalSymbols.TokenNameimplements:
	    tokenString = "TokenNameimplements";
	    break;
	case ITerminalSymbols.TokenNameimport:
	    tokenString = "TokenNameimport";
	    break;
	case ITerminalSymbols.TokenNameinstanceof:
	    tokenString = "TokenNameinstanceof";
	    break;
	case ITerminalSymbols.TokenNameint:
	    tokenString = "TokenNameint";
	    break;
	case ITerminalSymbols.TokenNameIntegerLiteral:
	    tokenString = "TokenNameIntegerLiteral";
	    break;
	case ITerminalSymbols.TokenNameinterface:
	    tokenString = "TokenNameinterface";
	    break;
	case ITerminalSymbols.TokenNameLBRACE:
	    tokenString = "TokenNameLBRACE";
	    break;
	case ITerminalSymbols.TokenNameLBRACKET:
	    tokenString = "TokenNameLBRACKET";
	    break;
	case ITerminalSymbols.TokenNameLEFT_SHIFT:
	    tokenString = "TokenNameLEFT_SHIFT";
	    break;
	case ITerminalSymbols.TokenNameLEFT_SHIFT_EQUAL:
	    tokenString = "TokenNameLEFT_SHIFT_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameLESS:
	    tokenString = "TokenNameLESS";
	    break;
	case ITerminalSymbols.TokenNameLESS_EQUAL:
	    tokenString = "TokenNameLESS_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamelong:
	    tokenString = "TokenNamelong";
	    break;
	case ITerminalSymbols.TokenNameLongLiteral:
	    tokenString = "TokenNameLongLiteral";
	    break;
	case ITerminalSymbols.TokenNameLPAREN:
	    tokenString = "TokenNameLPAREN";
	    break;
	case ITerminalSymbols.TokenNameMINUS:
	    tokenString = "TokenNameMINUS";
	    break;
	case ITerminalSymbols.TokenNameMINUS_EQUAL:
	    tokenString = "TokenNameMINUS_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameMINUS_MINUS:
	    tokenString = "TokenNameMINUS_MINUS";
	    break;
	case ITerminalSymbols.TokenNameMULTIPLY:
	    tokenString = "TokenNameMULTIPLY";
	    break;
	case ITerminalSymbols.TokenNameMULTIPLY_EQUAL:
	    tokenString = "TokenNameMULTIPLY_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamenative:
	    tokenString = "TokenNamenative";
	    break;
	case ITerminalSymbols.TokenNamenew:
	    tokenString = "TokenNamenew";
	    break;
	case ITerminalSymbols.TokenNameNOT:
	    tokenString = "TokenNameNOT";
	    break;
	case ITerminalSymbols.TokenNameNOT_EQUAL:
	    tokenString = "TokenNameNOT_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamenull:
	    tokenString = "TokenNamenull";
	    break;
	case ITerminalSymbols.TokenNameOR:
	    tokenString = "TokenNameOR";
	    break;
	case ITerminalSymbols.TokenNameOR_EQUAL:
	    tokenString = "TokenNameOR_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameOR_OR:
	    tokenString = "TokenNameOR_OR";
	    break;
	case ITerminalSymbols.TokenNamepackage:
	    tokenString = "TokenNamepackage";
	    break;
	case ITerminalSymbols.TokenNamePLUS:
	    tokenString = "TokenNamePLUS";
	    break;
	case ITerminalSymbols.TokenNamePLUS_EQUAL:
	    tokenString = "TokenNamePLUS_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamePLUS_PLUS:
	    tokenString = "TokenNamePLUS_PLUS";
	    break;
	case ITerminalSymbols.TokenNameprivate:
	    tokenString = "TokenNameprivate";
	    break;
	case ITerminalSymbols.TokenNameprotected:
	    tokenString = "TokenNameprotected";
	    break;
	case ITerminalSymbols.TokenNamepublic:
	    tokenString = "TokenNamepublic";
	    break;
	case ITerminalSymbols.TokenNameQUESTION:
	    tokenString = "TokenNameQUESTION";
	    break;
	case ITerminalSymbols.TokenNameRBRACE:
	    tokenString = "TokenNameRBRACE";
	    break;
	case ITerminalSymbols.TokenNameRBRACKET:
	    tokenString = "TokenNameRBRACKET";
	    break;
	case ITerminalSymbols.TokenNameREMAINDER:
	    tokenString = "TokenNameREMAINDER";
	    break;
	case ITerminalSymbols.TokenNameREMAINDER_EQUAL:
	    tokenString = "TokenNameREMAINDER_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamereturn:
	    tokenString = "TokenNamereturn";
	    break;
	case ITerminalSymbols.TokenNameRIGHT_SHIFT:
	    tokenString = "TokenNameRIGHT_SHIFT";
	    break;
	case ITerminalSymbols.TokenNameRIGHT_SHIFT_EQUAL:
	    tokenString = "TokenNameRIGHT_SHIFT_EQUAL";
	    break;
	case ITerminalSymbols.TokenNameRPAREN:
	    tokenString = "TokenNameRPAREN";
	    break;
	case ITerminalSymbols.TokenNameSEMICOLON:
	    tokenString = "TokenNameSEMICOLON";
	    break;
	case ITerminalSymbols.TokenNameshort:
	    tokenString = "TokenNameshort";
	    break;
	case ITerminalSymbols.TokenNamestatic:
	    tokenString = "TokenNamestatic";
	    break;
	case ITerminalSymbols.TokenNamestrictfp:
	    tokenString = "TokenNamestrictfp";
	    break;
	case ITerminalSymbols.TokenNameStringLiteral:
	    tokenString = "TokenNameStringLiteral";
	    break;
	case ITerminalSymbols.TokenNamesuper:
	    tokenString = "TokenNamesuper";
	    break;
	case ITerminalSymbols.TokenNameswitch:
	    tokenString = "TokenNameswitch";
	    break;
	case ITerminalSymbols.TokenNamesynchronized:
	    tokenString = "TokenNamesynchronized";
	    break;
	case ITerminalSymbols.TokenNamethis:
	    tokenString = "TokenNamethis";
	    break;
	case ITerminalSymbols.TokenNamethrow:
	    tokenString = "TokenNamethrow";
	    break;
	case ITerminalSymbols.TokenNamethrows:
	    tokenString = "TokenNamethrows";
	    break;
	case ITerminalSymbols.TokenNametransient:
	    tokenString = "TokenNametransient";
	    break;
	case ITerminalSymbols.TokenNametrue:
	    tokenString = "TokenNametrue";
	    break;
	case ITerminalSymbols.TokenNametry:
	    tokenString = "TokenNametry";
	    break;
	case ITerminalSymbols.TokenNameTWIDDLE:
	    tokenString = "TokenNameTWIDDLE";
	    break;
	case ITerminalSymbols.TokenNameUNSIGNED_RIGHT_SHIFT:
	    tokenString = "TokenNameUNSIGNED_RIGHT_SHIFT";
	    break;
	case ITerminalSymbols.TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL:
	    tokenString = "TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL";
	    break;
	case ITerminalSymbols.TokenNamevoid:
	    tokenString = "TokenNamevoid";
	    break;
	case ITerminalSymbols.TokenNamevolatile:
	    tokenString = "TokenNamevolatile";
	    break;
	case ITerminalSymbols.TokenNamewhile:
	    tokenString = "TokenNamewhile";
	    break;
	case ITerminalSymbols.TokenNameWHITESPACE:
	    tokenString = "TokenNameWHITESPACE";
	    break;
	case ITerminalSymbols.TokenNameXOR:
	    tokenString = "TokenNameXOR";
	    break;
	case ITerminalSymbols.TokenNameXOR_EQUAL:
	    tokenString = "TokenNameXOR_EQUAL";
	    break;
	default:
	    tokenString = "TokenNameUNKNOWN";
	    break;
	}
	return tokenString;
    }
}
