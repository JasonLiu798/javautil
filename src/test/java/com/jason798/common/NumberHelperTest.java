package com.jason798.common;

import com.jason798.number.NumberHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/**
 * NumberHelper Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class NumberHelperTest {

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {

    }

    /**
     * Method: long2Int(long lnum)
     */
    @Test
    public void testLong2Int() throws Exception {

    }

    /**
     * Method: filterDot(String number)
     */
    @Test
    public void testFilterDot() throws Exception {
        assertEquals("23", NumberHelper.filterDot("23"));
        assertEquals("1", NumberHelper.filterDot("1.23"));
        assertEquals("0", NumberHelper.filterDot("0.23"));
    }

    /**
     * Method: minus(T t1, T t2)
     */
    @Test
    public void testMinus() throws Exception {

    }

    /**
     * Method: incr(T t1)
     */
    @Test
    public void testIncr() throws Exception {

    }

    /**
     * Method: add(T t1, T t2)
     */
    @Test
    public void testAdd() throws Exception {

    }

    /**
     * Method: div(T t1, T t2)
     */
    @Test
    public void testDiv() throws Exception {

    }

    /**
     * Method: mod(T t1, T t2)
     */
    @Test
    public void testMod() throws Exception {

    }

    /**
     * Method: getNumber(Class<T> cls, int i)
     */
    @Test
    public void testGetNumber() throws Exception {

    }

}
