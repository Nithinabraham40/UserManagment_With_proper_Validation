package com.tutorial.uservalidation.customvalidator;

import java.lang.annotation.Retention;

import java.lang.annotation.Target;

import com.tutorial.uservalidation.customvalidationimpl.PhoneNumberValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;

import java.lang.annotation.RetentionPolicy;


@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface ValidPhoneNumber {
    String message()default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
