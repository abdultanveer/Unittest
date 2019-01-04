package com.example.admin.unittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit1 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   

   @Test(expected = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}