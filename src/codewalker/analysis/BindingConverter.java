package codewalker.analysis;

public class BindingConverter {

    public static String bindingToString(int bindingType)
    {
	switch (bindingType)
	{
	case 1: return "PACKAGE_IDENTIFIER";
	case 2: return "TYPE_IDENTIFIER";
	case 3: return "VARIABLE_IDENTIFIER";
	case 4: return "METHOD_IDENTIFIER";
	case 5: return "ANNOTATION_IDENTIFIER";
	case 6: return "MEMBER_VALUE_PAIR_IDENTIFIER";
	default: return "UNKNOWN_IDENTIFIER";
	}
    }   
}
