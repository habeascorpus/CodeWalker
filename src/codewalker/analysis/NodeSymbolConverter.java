package codewalker.analysis;

import org.eclipse.jdt.core.dom.ASTNode;

public class NodeSymbolConverter {

    public static String convertToString(int nodeType)
    {
	String s;
	switch (nodeType) {
        case ASTNode.ANNOTATION_TYPE_DECLARATION:
            s = "ANNOTATION_TYPE_DECLARATION";
            break;
        case ASTNode.ANNOTATION_TYPE_MEMBER_DECLARATION:
            s = "ANNOTATION_TYPE_MEMBER_DECLARATION";
            break;
        case ASTNode.ANONYMOUS_CLASS_DECLARATION:
            s = "ANONYMOUS_CLASS_DECLARATION";
            break;
        case ASTNode.ARRAY_ACCESS:
            s = "ARRAY_ACCESS";
            break;
        case ASTNode.ARRAY_CREATION:
            s = "ARRAY_CREATION";
            break;
        case ASTNode.ARRAY_INITIALIZER:
            s = "ARRAY_INITIALIZER";
            break;
        case ASTNode.ARRAY_TYPE:
            s = "ARRAY_TYPE";
            break;
        case ASTNode.ASSERT_STATEMENT:
            s = "ASSERT_STATEMENT";
            break;
        case ASTNode.ASSIGNMENT:
            s = "ASSIGNMENT";
            break;
        case ASTNode.BLOCK:
            s = "BLOCK";
            break;
        case ASTNode.BLOCK_COMMENT:
            s = "BLOCK_COMMENT";
            break;
        case ASTNode.BOOLEAN_LITERAL:
            s = "BOOLEAN_LITERAL";
            break;
        case ASTNode.BREAK_STATEMENT:
            s = "BREAK_STATEMENT";
            break;
        case ASTNode.CAST_EXPRESSION:
            s = "CAST_EXPRESSION";
            break;
        case ASTNode.CATCH_CLAUSE:
            s = "CATCH_CLAUSE";
            break;
        case ASTNode.CHARACTER_LITERAL:
            s = "CHARACTER_LITERAL";
            break;
        case ASTNode.CLASS_INSTANCE_CREATION:
            s = "CLASS_INSTANCE_CREATION";
            break;
        case ASTNode.COMPILATION_UNIT:
            s = "COMPILATION_UNIT";
            break;
        case ASTNode.CONDITIONAL_EXPRESSION:
            s = "CONDITIONAL_EXPRESSION";
            break;
        case ASTNode.CONSTRUCTOR_INVOCATION:
            s = "CONSTRUCTOR_INVOCATION";
            break;
        case ASTNode.CONTINUE_STATEMENT:
            s = "CONTINUE_STATEMENT";
            break;
        case ASTNode.DO_STATEMENT:
            s = "DO_STATEMENT";
            break;
        case ASTNode.EMPTY_STATEMENT:
            s = "EMPTY_STATEMENT";
            break;
        case ASTNode.ENHANCED_FOR_STATEMENT:
            s = "ENHANCED_FOR_STATEMENT";
            break;
        case ASTNode.ENUM_CONSTANT_DECLARATION:
            s = "ENUM_CONSTANT_DECLARATION";
            break;
        case ASTNode.ENUM_DECLARATION:
            s = "ENUM_DECLARATION";
            break;
        case ASTNode.EXPRESSION_STATEMENT:
            s = "EXPRESSION_STATEMENT";
            break;
        case ASTNode.FIELD_ACCESS:
            s = "FIELD_ACCESS";
            break;
        case ASTNode.FIELD_DECLARATION:
            s = "FIELD_DECLARATION";
            break;
        case ASTNode.FOR_STATEMENT:
            s = "FOR_STATEMENT";
            break;
        case ASTNode.IF_STATEMENT:
            s = "IF_STATEMENT";
            break;
        case ASTNode.IMPORT_DECLARATION:
            s = "IMPORT_DECLARATION";
            break;
        case ASTNode.INFIX_EXPRESSION:
            s = "INFIX_EXPRESSION";
            break;
        case ASTNode.INITIALIZER:
            s = "INITIALIZER";
            break;
        case ASTNode.INSTANCEOF_EXPRESSION:
            s = "INSTANCEOF_EXPRESSION";
            break;
        case ASTNode.JAVADOC:
            s = "JAVADOC";
            break;
        case ASTNode.LABELED_STATEMENT:
            s = "LABELED_STATEMENT";
            break;
        case ASTNode.LINE_COMMENT:
            s = "LINE_COMMENT";
            break;
        case ASTNode.MARKER_ANNOTATION:
            s = "MARKER_ANNOTATION";
            break;
        case ASTNode.MEMBER_REF:
            s = "MEMBER_REF";
            break;
        case ASTNode.MEMBER_VALUE_PAIR:
            s = "MEMBER_VALUE_PAIR";
            break;
        case ASTNode.METHOD_DECLARATION:
            s = "METHOD_DECLARATION";
            break;
        case ASTNode.METHOD_INVOCATION:
            s = "METHOD_INVOCATION";
            break;
        case ASTNode.METHOD_REF:
            s = "METHOD_REF";
            break;
        case ASTNode.METHOD_REF_PARAMETER:
            s = "METHOD_REF_PARAMETER";
            break;
        case ASTNode.MODIFIER:
            s = "MODIFIER";
            break;
        case ASTNode.NORMAL_ANNOTATION:
            s = "NORMAL_ANNOTATION";
            break;
        case ASTNode.NULL_LITERAL:
            s = "NULL_LITERAL";
            break;
        case ASTNode.NUMBER_LITERAL:
            s = "NUMBER_LITERAL";
            break;
        case ASTNode.PACKAGE_DECLARATION:
            s = "PACKAGE_DECLARATION";
            break;
        case ASTNode.PARAMETERIZED_TYPE:
            s = "PARAMETERIZED_TYPE";
            break;
        case ASTNode.PARENTHESIZED_EXPRESSION:
            s = "PARENTHESIZED_EXPRESSION";
            break;
        case ASTNode.POSTFIX_EXPRESSION:
            s = "POSTFIX_EXPRESSION";
            break;
        case ASTNode.PREFIX_EXPRESSION:
            s = "PREFIX_EXPRESSION";
            break;
        case ASTNode.PRIMITIVE_TYPE:
            s = "PRIMITIVE_TYPE";
            break;
        case ASTNode.QUALIFIED_NAME:
            s = "QUALIFIED_NAME";
            break;
        case ASTNode.QUALIFIED_TYPE:
            s = "QUALIFIED_TYPE";
            break;
        case ASTNode.RETURN_STATEMENT:
            s = "RETURN_STATEMENT";
            break;
        case ASTNode.SIMPLE_NAME:
            s = "SIMPLE_NAME";
            break;
        case ASTNode.SIMPLE_TYPE:
            s = "SIMPLE_TYPE";
            break;
        case ASTNode.SINGLE_MEMBER_ANNOTATION:
            s = "SINGLE_MEMBER_ANNOTATION";
            break;
        case ASTNode.SINGLE_VARIABLE_DECLARATION:
            s = "SINGLE_VARIABLE_DECLARATION";
            break;
        case ASTNode.STRING_LITERAL:
            s = "STRING_LITERAL";
            break;
        case ASTNode.SUPER_CONSTRUCTOR_INVOCATION:
            s = "SUPER_CONSTRUCTOR_INVOCATION";
            break;
        case ASTNode.SUPER_FIELD_ACCESS:
            s = "SUPER_FIELD_ACCESS";
            break;
        case ASTNode.SUPER_METHOD_INVOCATION:
            s = "SUPER_METHOD_INVOCATION";
            break;
        case ASTNode.SWITCH_CASE:
            s = "SWITCH_CASE";
            break;
        case ASTNode.SWITCH_STATEMENT:
            s = "SWITCH_STATEMENT";
            break;
        case ASTNode.SYNCHRONIZED_STATEMENT:
            s = "SYNCHRONIZED_STATEMENT";
            break;
        case ASTNode.TAG_ELEMENT:
            s = "TAG_ELEMENT";
            break;
        case ASTNode.TEXT_ELEMENT:
            s = "TEXT_ELEMENT";
            break;
        case ASTNode.THIS_EXPRESSION:
            s = "THIS_EXPRESSION";
            break;
        case ASTNode.THROW_STATEMENT:
            s = "THROW_STATEMENT";
            break;
        case ASTNode.TRY_STATEMENT:
            s = "TRY_STATEMENT";
            break;
        case ASTNode.TYPE_DECLARATION:
            s = "TYPE_DECLARATION";
            break;
        case ASTNode.TYPE_DECLARATION_STATEMENT:
            s = "TYPE_DECLARATION_STATEMENT";
            break;
        case ASTNode.TYPE_LITERAL:
            s = "TYPE_LITERAL";
            break;
        case ASTNode.TYPE_PARAMETER:
            s = "TYPE_PARAMETER";
            break;
        case ASTNode.UNION_TYPE:
            s = "UNION_TYPE";
            break;
        case ASTNode.VARIABLE_DECLARATION_EXPRESSION:
            s = "VARIABLE_DECLARATION_EXPRESSION";
            break;
        case ASTNode.VARIABLE_DECLARATION_FRAGMENT:
            s = "VARIABLE_DECLARATION_FRAGMENT";
            break;
        case ASTNode.VARIABLE_DECLARATION_STATEMENT:
            s = "VARIABLE_DECLARATION_STATEMENT";
            break;
        case ASTNode.WHILE_STATEMENT:
            s = "WHILE_STATEMENT";
            break;
        case ASTNode.WILDCARD_TYPE:
            s = "WILDCARD_TYPE";
            break;
        default:
            s = "UNKNOWN_NODE_TYPE";
            break;
	}
	return s;
    }
    
}
