package com.creativecampus.commons.validation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ArgumentValidation
{
}
