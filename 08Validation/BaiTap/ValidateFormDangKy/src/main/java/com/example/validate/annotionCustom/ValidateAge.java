package com.example.validate.annotionCustom;

import com.example.validate.common.ValidatedAge;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class ValidateAge implements ConstraintValidator<ValidatedAge , String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value.equals("")){
            return  false;
        }
        else {
            LocalDate now =LocalDate.now();
            LocalDate input=LocalDate.parse(value);
            return (now.getYear()-input.getYear())>18;
        }

    }
}
