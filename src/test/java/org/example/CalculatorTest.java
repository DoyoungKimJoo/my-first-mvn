package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {


    public void testAddTrue() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add( 5, 10);
        int expectedValue = 15;
//        if (actualValue == expectedValue) {
//            assertTrue(true);
//
//        } else {
//            assertTrue(false);
//        }
        assertTrue(actualValue == expectedValue);
    }

    public void testAddFalse() throws Exception {
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 24;
//        if (actualValue == expectedValue) {
//            assertTrue(true);
//
//        } else {
//            assertTrue(false);
//        }
        assertFalse(actualValue == expectedValue);
        assertTrue(actualValue != expectedValue);
    }

        public void testAddException()  {
            Calculator calc = new Calculator();
            try {
                int result = calc.add( 15, 20);
            }catch (Exception ex) {
                assertTrue(true);

            }


        }
    }
