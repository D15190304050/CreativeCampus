package com.creativecampus.commons;

public enum CommonErrorResponses
{
    UNKNOWN_ERROR(-1, "Unknown error."),
    NOT_LOGIN(1, "Not login."),
    NO_SUCH_TEACHER(2, "No such teacher."),
    ARGUMENT_NULL_EXCEPTION(3, "The required argument is null."),
    ARGUMENT_EXCEPTION(4, "The given argument is invalid."),
    SYSTEM_ERROR(5, "Error when executing ..."),
    ACCOUNT_EXISTS(6, "The account exists, please try others."),
    ;

    private int code;
    private String message;

    CommonErrorResponses(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
