package com.github.knightliao.disconf.web.support.common.web.constraint.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.github.knightliao.disconf.web.support.common.web.constraint.PageOrderConstraint;

/**
 * @author liaoqiqi
 * @version 2014-1-14
 */
public class PageOrderValidator implements ConstraintValidator<PageOrderConstraint, String> {

    public static final String ASC = "asc";
    public static final String DESC = "desc";

    @Override
    public void initialize(PageOrderConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value.equals(ASC) || value.equals(DESC) || value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
