package com.atjl.validate.validator.param;


import com.atjl.validate.api.field.ValidateField;
import com.atjl.validate.api.ValidateForm;
import com.atjl.validate.api.Validator;
import com.atjl.validate.validator.base.RequireWithBase;

import java.util.Set;

/**
 * 指定的 *任意* 字段存在为空时，此字段必填
 */
public class RequireWithOut extends RequireWithBase {
    public static final String DFT_MSG = "%s为空，该字段必填";

    public RequireWithOut(Set<String> refs) {
        super(refs,DFT_MSG);
    }

    public RequireWithOut(Set<String> refs, String msg) {
        super(refs, msg);
    }

    public void validate(ValidateForm form, ValidateField field) {
        //存在空，且值为空 抛异常
        validateBase(form, field, RequireWithBase.TP_NULL, true);
    }

    @Override
    public Validator parse(String str) {

        return null;
    }
}
