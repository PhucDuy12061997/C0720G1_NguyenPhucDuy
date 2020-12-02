package com.example.validate.common;

import com.example.validate.annotionCustom.ValidateAge;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target({FIELD })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {ValidateAge.class})
public @interface ValidatedAge {

        String message() default "Not old enough !";

        Class<?>[] groups() default { };

        Class<? extends Payload>[] payload() default { };

    }
