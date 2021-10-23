package com.creativecampus.commons;

/**
 * @apiNote The {@link ErrorMessageTemplates} class assumes all the given argument is not null.
 */
public class ErrorMessageTemplates
{
    private ErrorMessageTemplates() {}

    public static final String STRING_EMPTY_PREFIX = "The member (with type String) \"";
    public static final String STRING_EMPTY_SUFFIX = "\" is null or empty.";
    public static final String EMAIL_FORMAT_EXCEPTION = "The email is in a wrong format.";

    private static final String ARGUMENT_NULL = "The argument \"%s\" is null.";
    private static final String STRING_EMPTY = "The member (with type String) \"%s\" is null or empty.";
    private static final String MEMBER_NULL = "The member \"%s\" is null.";


    public static String argumentNullException(String argumentName)
    {
        return String.format(ARGUMENT_NULL, argumentName);
    }

    public static String stringEmptyException(String memberName)
    {
        return String.format(STRING_EMPTY, memberName);
    }

    public static String memberNullException(String memberName)
    {
        return String.format(MEMBER_NULL, memberName);
    }
}