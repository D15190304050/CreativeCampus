package com.creativecampus.commons;

import dataworks.OutString;

public class Validator
{
    private Validator(){}

    public static boolean validate(IValidate value, OutString errorMessage)
    {
        if (value == null)
        {
            errorMessage.setString(ErrorMessageTemplates.argumentNullException("value"));
            return false;
        }

        return value.validate(errorMessage);
    }
}
