package com.junit.class01;
/*
Test Cases for Multiplication method:

1) a = 10, b = 10   exp - 100
2) a = 10, b = 0   exp - 0
3) a = -20, b = 0   exp - 0
4) a = -10, b = -10    exp - (100)

 */
import org.junit.Assert;

import org.junit.Test;

public class MulTest extends BaseTest{

        // When we use @Test then it'll become test cases otherwise it'll be only java method
        @Test
        public void verifyPositiveEqualNumber(){
            double actResult = c.mul(10, 10);
            double expResult = 100;
            Assert.assertEquals("Expected was " + expResult + " : Actual " + actResult, actResult, expResult, 0.0);
        }

        @Test
        public void verifyPositiveFirstLargerThanSecondNumber(){
            double actResult = c.mul(20, 0);
            double expResult = 0;
            Assert.assertEquals("Expected was " + expResult + " : Actual " + actResult, actResult, expResult, 0.0);
        }

        @Test
        public void verifyPositiveSecondLargerThanFirstNotEqualNumber(){
            double actResult = c.mul(-20, 0);
            double expResult = 0;
            Assert.assertEquals("Expected was " + expResult + " : Actual " + actResult, actResult, expResult, 0.0);
        }

        @Test
        public void verifyPositiveSecondLargerThanFirstWithMinusNotEqualNumber(){
            double actResult = c.mul(-10, -10);
            double expResult = 100;
            Assert.assertEquals("Expected was " + expResult + " : Actual " + actResult, actResult, expResult, 0.0);
        }
    }
