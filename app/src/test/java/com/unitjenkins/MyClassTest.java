package com.unitjenkins;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by Hari Prasad on 3/16/17.
 */
public class MyClassTest {
    MyClass myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new MyClass();
    }

    @Test
    public void compare() throws Exception {
        int a = 10;
        int b = 20;
        boolean f = myClass.compare(a, b);

        boolean expression = false;
        assertFalse(f);
//        assertEquals(expression,f);
    }

    @Test
    public void sum() throws Exception {
        int a = 10;
        int b = 20;
        int add = myClass.sum(a, b);
        int result = 30;
        assertEquals(add, result);
    }

    @Test
    public void getString() throws Exception {
        String srtResult = myClass.getString();

        String expString = "Hello World";
        assertEquals( srtResult,expString);
    }
}