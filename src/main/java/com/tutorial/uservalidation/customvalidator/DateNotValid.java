package com.tutorial.uservalidation.customvalidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.tutorial.uservalidation.customvalidationimpl.DateValidator;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidator.class)
public @interface DateNotValid {

	
	String message()default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
