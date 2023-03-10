package com.example.backend.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 */
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = { UniqueeMailNameValidator.class })
public @interface UniqueeMail {
    String message() default "{backend.constraints.UniqueEmail.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
