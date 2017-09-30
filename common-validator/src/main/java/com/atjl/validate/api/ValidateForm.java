package com.atjl.validate.api;

import com.atjl.validate.api.field.ValidateField;

import java.util.Map;

public interface ValidateForm {

    /**
     * 校验
     *
     * @return
     */
    boolean validate();

    /**
     * 设置表单值
     *
     * @param obj
     */
    void setValue(Object obj);

    /**
     * 设置表单值
     *
     * @param valueMap
     */
    void setValue(Map<String, Object> valueMap);

    /**
     * validate = false时，有值
     *
     * @return
     */
    Map<String, String> getErrors();

    String getOneLineError();

    ValidateField getField(String fieldKey);

}
