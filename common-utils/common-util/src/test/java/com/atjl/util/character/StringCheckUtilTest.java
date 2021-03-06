package com.atjl.util.character;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StringCheckUtilTest {


    @Test
    public void testIsEmptyTarget() throws Exception {

    }

    @Test
    public void testIsNotEmptyTarget() throws Exception {

    }

    @Test
    public void testIsEmptyStr() throws Exception {

    }

    @Test
    public void testIsNULL() throws Exception {

    }

    @Test
    public void testIsExistEmptyTargets() throws Exception {
        String s1 = "a";
        String s2 = "b";
        String n = null;
        assertEquals(true, StringCheckUtil.isExistEmpty(n));
        assertEquals(false, StringCheckUtil.isExistEmpty(s1));
        assertEquals(false, StringCheckUtil.isExistEmpty(s1, s2));
        assertEquals(true, StringCheckUtil.isExistEmpty(s1, n, n));
        assertEquals(true, StringCheckUtil.isExistEmpty(s1, s2, n));
        assertEquals(true, StringCheckUtil.isExistEmpty(n, n, n));
    }

    @Test
    public void testIsExistNotEmpty() throws Exception {
        String s1 = "a";
        String s2 = "b";
        String n = null;
        assertEquals(false, StringCheckUtil.isExistNotEmpty(n));
        assertEquals(true, StringCheckUtil.isExistNotEmpty(s1));
        assertEquals(true, StringCheckUtil.isExistNotEmpty(s1, s2));
        assertEquals(true, StringCheckUtil.isExistNotEmpty(s1, n, n));
        assertEquals(true, StringCheckUtil.isExistNotEmpty(s1, s2, n));
        assertEquals(false, StringCheckUtil.isExistNotEmpty(n, n, n));
    }

    @Test
    public void testIsAllEmptyTargets() throws Exception {
        String s1 = "a";
        String s2 = "b";
        String n = null;
        assertEquals(true, StringCheckUtil.isAllEmpty(n));
        assertEquals(false, StringCheckUtil.isAllEmpty(s1));
        assertEquals(false, StringCheckUtil.isAllEmpty(s1, s2));
        assertEquals(false, StringCheckUtil.isAllEmpty(s1, s2, n));
        assertEquals(true, StringCheckUtil.isAllEmpty(n, n, n));
    }

    @Test
    public void testIsAllNotEmptyTargets() throws Exception {
        String s1 = "a";
        String s2 = "b";
        assertEquals(false, StringCheckUtil.isAllNotEmpty(null));
        assertEquals(true, StringCheckUtil.isAllNotEmpty(s1));
        assertEquals(true, StringCheckUtil.isAllNotEmpty(s1, s2));
        assertEquals(false, StringCheckUtil.isAllNotEmpty(s1, s2, null));
    }


    @Test
    public void contain() throws Exception {
        String ss = "3";//new String[]{"123", "456", "123123123", "324909803"};
        assertEquals(true, StringCheckUtil.contain("123", "3"));
        assertEquals(true, StringCheckUtil.contain("456", "56"));
        assertEquals(true, StringCheckUtil.contain("56789", "56789"));
        assertEquals(true, StringCheckUtil.contain("123123", "1"));
        assertEquals(false, StringCheckUtil.contain("567", null));

        assertEquals(false, StringCheckUtil.contain(null, "3"));

        assertEquals(false, StringCheckUtil.contain(null, null));

        assertEquals(true, StringCheckUtil.contain("", ""));
    }

    @Test
    public void containExist() throws Exception {
        String[] ss = new String[]{"123", "456", "123123123", "324909803"};
        assertEquals(true, StringCheckUtil.containExist("123", ss));
        assertEquals(true, StringCheckUtil.containExist("456", ss));
        assertEquals(true, StringCheckUtil.containExist("123123", ss));
        assertEquals(false, StringCheckUtil.containExist("567", ss));

        assertEquals(false, StringCheckUtil.containExist(null, ss));

        assertEquals(false, StringCheckUtil.containExist(null, null));
    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testHasLengthStr() throws Exception {

    }

    @Test
    public void testHasTextStr() throws Exception {

    }

    @Test
    public void testIsPisubstr() throws Exception {

    }

    @Test
    public void testStrInCollection() {
        String s = "1";
        List<String> l = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            l.add(i + "");
        }
        boolean res = StringCheckUtil.containExistInCollection(s, l);
        assertEquals(true, res);

        s = "6";
        res = StringCheckUtil.containExistInCollection(s, l);
        assertEquals(false, res);
    }

    @Test
    public void strInStrings() {
        String s = "1";
        boolean res = StringCheckUtil.containExist(s, "1", "2", "3");
        assertEquals(true, res);

        s = "6";
        res = StringCheckUtil.containExist(s, "1", "2", "3");
        assertEquals(false, res);

        s = null;
        res = StringCheckUtil.containExist(s, "1", "2", "3");
        assertEquals(false, res);

        res = StringCheckUtil.containExistInCollection(null, null);
        assertEquals(false, res);

        res = StringCheckUtil.containExist(null, "1");
        assertEquals(false, res);

        res = StringCheckUtil.containExistInCollection("1", null);
        assertEquals(false, res);
    }

    @Test
    public void startWith() {
        String s = null;
        boolean res = StringCheckUtil.startWith(s, "ccc");
        assertEquals(false, res);

        s = "aa";
        res = StringCheckUtil.startWith(s, null);
        assertEquals(false, res);

        s = "abc";
        res = StringCheckUtil.startWith(s, "ccc");
        assertEquals(false, res);

        s = "abc";
        res = StringCheckUtil.startWith(s, "a");
        assertEquals(true, res);

        s = "a";
        res = StringCheckUtil.startWith(s, "abc");
        assertEquals(false, res);

    }


    @Test
    public void startWithExist() {
        String s = "abc";

        boolean res = StringCheckUtil.startWithExist(s, "ccc", "aa", "a");
        assertEquals(true, res);

        s = null;
        res = StringCheckUtil.startWithExist(s, "ccc", "aa", "a");
        assertEquals(false, res);

        s = "addd";
        res = StringCheckUtil.startWithExist(s, "ccc", null, "a");
        assertEquals(true, res);

        s = "addd";
        res = StringCheckUtil.startWithExist(s, "ccc", null, "ade");
        assertEquals(false, res);

        s = "addd";
        res = StringCheckUtil.startWithExist(s, "ccc", "ddd", "ade");
        assertEquals(false, res);

        s = "a";
        res = StringCheckUtil.startWithExist(s, "ccc", "ddd", "ade");
        assertEquals(false, res);

        s = "a";
        res = StringCheckUtil.startWithExist(s, "ccc", "ddd", "a");
        assertEquals(true, res);

    }


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
} 
