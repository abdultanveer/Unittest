package com.example.admin.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

   @Before
    public void setUp() throws Exception { //setup the test
       System.out.println("initializations");
    }

    @After
    public void tearDown() throws Exception { // removing attachments
        System.out.println("releasing resources");

    }

    @Test
    public void test_add() {
        System.out.println("test running");

        int expected = 5;
        int actual = Calculator.add(2,3);
        assertEquals(expected,actual);
    }


}