package com.atjl.util.common;

import com.atjl.util.character.StringCheckUtil;
import com.atjl.util.dto.TestDtoChild;
import com.atjl.util.json.JSONFastJsonUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

public class ReflectUtilTest {


    @Test
    public void testTryConvertToBoxClass() throws Exception {

    }

    @Test
    public void testCheckClassExist() throws Exception {

    }

    @Test
    public void testGetInstance() throws Exception {

    }



    @Test
    public void testChkImplementIntfForObjIntf() throws Exception {

    }

    @Test
    public void testChkImpiIntfForObjIntfs() throws Exception {

    }

    @Test
    public void testChkImpiIntfForClzIntfs() throws Exception {

    }

    @Test
    public void testGetAllField() {
        TestDtoChild child = new TestDtoChild();
        List<Field> fields = ReflectUtil.getFieldAll(child);
        System.out.println("res:" + fields);
    }

    @Test
    public void testGetFieldSet() throws Exception {

    }

    @Test
    public void testGetFieldsHaveSetter() throws Exception {

    }

    @Test
    public void testGetAllFieldsHaveSetter() throws Exception {

    }

    @Test
    public void testGetFieldType() throws Exception {

    }

    @Test
    public void testGetFieldTypeAll() throws Exception {

    }


    @Test
    public void testGetter() throws Exception {

    }

    @Test
    public void testGetGetterMethod() throws Exception {

    }

    @Test
    public void testGetterInner() throws Exception {

    }

    @Test
    public void testSetterForObjFieldValTypeVal() throws Exception {

    }

    @Test
    public void testSetterForObjFieldVal() throws Exception {

    }

    @Test
    public void testSetterForce() throws Exception {

    }

    /**
     * get field
     *
     * @throws Exception
     */
    @Test
    public void testGetField() throws Exception {


    }

    @Test
    public void testCopyFieldForSourceTargetIgnoresAllowNull() throws Exception {
        TestDtoChild src = new TestDtoChild();
        src.setChildField(2L);
        src.setF1(1);
        TestDtoChild dest = new TestDtoChild();
        System.out.println("bf:" + JSONFastJsonUtil.objectToJson(src) + "," + JSONFastJsonUtil.objectToJson(dest));
        ReflectUtil.copyField(src, dest);
        System.out.println("af:" + JSONFastJsonUtil.objectToJson(src) + "," + JSONFastJsonUtil.objectToJson(dest));
    }

    @Test
    public void testCopyFieldForSourceTarget() throws Exception {

    }

    @Test
    public void testGetSelfAndParentClassListBean() throws Exception {

    }

    @Test
    public void testGetSelfAndParentClassListClz() throws Exception {

    }

    @Test
    public void testGetClassListForClzOpt() throws Exception {

    }

    @Test
    public void testGetClassListForBeanOpt() throws Exception {

    }

    @Test
    public void testGetFieldValueMapForObjAllowNullValueParentOptIgnoresSpecifies() throws Exception {

    }

    @Test
    public void testGetFieldValueMapIncludeNull() throws Exception {

    }

    @Test
    public void testGetFieldValueMapAllIncludeNull() throws Exception {

    }

    @Test
    public void testGetFieldValueMapForBeanAllowNullValue() throws Exception {

    }



    @Test
    public void testGetFieldValueMapIncludeNullSpec() throws Exception {

    }

    @Test
    public void testGetFieldMapForBeanAllowNullValueOptIgnoresSpecifies() throws Exception {

    }

    @Test
    public void testGetFieldMapBean() throws Exception {

    }

    @Test
    public void testGetFieldMapAll() throws Exception {

    }

    @Test
    public void testGetFieldMapForBeanAllowNullValue() throws Exception {

    }

    @Test
    public void testGetDeclaredMethod() throws Exception {

    }

    @Test
    public void testGetDeclaredField() throws Exception {

    }

    @Test
    public void testConvert() throws Exception {

    }

    @Test
    public void testInvokeMethod() throws Exception {

    }


    @Test
    public void testCheckGetMethod() throws Exception { 
                /* 
                try { 
                   Method method = ReflectUtil.getClass().getMethod("checkGetMethod", Method[].class, String.class);
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testIsBoolean() throws Exception { 
                /* 
                try { 
                   Method method = ReflectUtil.getClass().getMethod("isBoolean", Field.class);
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testGenerateGetName() throws Exception { 
                /* 
                try { 
                   Method method = ReflectUtil.getClass().getMethod("generateGetName", String.class, boolean.class);
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Test
    public void testIsEmpty() throws Exception { 
                /* 
                try { 
                   Method method = ReflectUtil.getClass().getMethod("isEmpty", Object.class);
                   method.setAccessible(true); 
                   method.invoke(<Object>, <Parameters>); 
                } catch(NoSuchMethodException e) { 
                } catch(IllegalAccessException e) { 
                } catch(InvocationTargetException e) { 
                } 
                */
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
} 
