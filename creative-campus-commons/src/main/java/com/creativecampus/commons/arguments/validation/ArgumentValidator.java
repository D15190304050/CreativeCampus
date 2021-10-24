package com.creativecampus.commons.arguments.validation;

import com.creativecampus.commons.ErrorMessageTemplates;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Slf4j
public class ArgumentValidator
{
    private ArgumentValidator(){}

    private static final Validator VALIDATOR;

    static
    {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        VALIDATOR = validatorFactory.getValidator();
    }

    private static Set<ConstraintViolation<Object>> getConstraintViolation(Object argument)
    {
        if (argument.getClass().getAnnotation(MemberValidation.class) != null)
            return VALIDATOR.validate(argument);

        return null;
    }

    private static String collectErrorMessage(Set<ConstraintViolation<Object>> constraintViolationSet)
    {
        if (!CollectionUtils.isEmpty(constraintViolationSet))
        {
            StringBuilder errorMessageBuilder = new StringBuilder();
            for (ConstraintViolation<Object> violation : constraintViolationSet)
            {
                String errorMessage = "Violation: " + violation.getPropertyPath() + " " + violation.getMessage();
//                log.error(errorMessage);
                errorMessageBuilder.append(errorMessage).append(System.lineSeparator());
            }
            return errorMessageBuilder.toString();
        }

        return null;
    }

    public static String getValidationErrorMessage(Object argument)
    {
        // The default constraint validator only validate non-null arguments.
        // Which means the argument-not-null constraint must be implemented here.
        if (argument == null)
            return ErrorMessageTemplates.ARGUMENT_NULL_EXCEPTION;

        return collectErrorMessage(getConstraintViolation(argument));
    }
}
