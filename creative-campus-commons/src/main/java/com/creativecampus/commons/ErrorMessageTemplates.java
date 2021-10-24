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
    public static final String ARGUMENT_NULL_EXCEPTION = "The argument must not be null.";
}
