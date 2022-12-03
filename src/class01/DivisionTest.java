package class01;
/*
Test Cases for Division method:

1. 10, 5 expected = 2 // verifyCaseWhenFirstNumberGreaterThanSecondNumber
2. 5, 10, expected = 0 // verifyCaseWhenFirstNumberLessThanSecondNumber
3. 10, 10, expected = 1 // verifyCaseWhenBothNumbersAreEqual
4. 10, 0, expected = Exception
5. 0, 10, expected = 0
6. -20, 10, expected = -2
7. -20, -10, expected = 2
8. 20, -10, expected = -2
9. 0, 0, expected result - Exception
10. 10, 1, expected result - 1
11. 10000, 2500, expected result - 4
 */

import class02.BaseTest;
import class02.TestGroups.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

// in "Test" Class, we cannot have the "main" method, because we need our Test Cases to be independent from each other,
// and as we know "main" method runs all the methods, present in the Class, at once,
// so we need to figure out the alternative to the "main" method, so that we can still run our program
// that is what we will use the JUnit's library Annotations for

public class DivisionTest extends BaseTest {
    // we need to tell Java, that this is not the normal method, this is an annotation
    // "@" is the special symbol to tell Java that this is not a regular method, but a Test Case
    // always has to be above(!) the method
    @Category({Smoke.class, Maryna.class})
    @Test
    public void verifyCaseWhenFirstNumberGreaterThanSecondNumber(){
        int expectedResult = 2;
        int a = 10, b = 5;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        // Assert is the Class that has methods to help us validate our Test Cases
        // .assertTrue is the method, present in the Assert Class
        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenFirstNumberLessThanSecondNumber(){
        int expectedResult = 0;
        int a = 5, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenBothNumbersAreEqual(){
        int expectedResult = 1;
        int a = 10, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

//    @Test(expected = java.lang.ArithmeticException.class)
//    public void verifyCaseWhenSecondNumberIsZero(){
//        double resultDiv = Calculator.div(10, 0);
//        assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resultDiv));
//    }
    @Test
    public void verifyCaseWhenSecondNumberIsZero(){
        int expectedResult = 0;
        int a = 10, b = 0;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenFirstNumberIsZero(){
        int expectedResult = 0;
        int a = 0, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenFirstNumberIsNegative(){
        int expectedResult = -2;
        int a = -20, b = 10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenBothNumbersAreNegative() {
        int expectedResult = 2;
        int a = -20, b = -10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message, expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenSecondNumberIsNegative(){
        int expectedResult = -2;
        int a = 20, b = -10;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

//    @Test(expected = java.lang.ArithmeticException.class)
//    public void verifyCaseWhenBothNumbersAreZero(){
//        double resultDiv = Calculator.div(0, 0);
//        assertTrue("Divide by zero gives infinity as result", Double.isInfinite(resultDiv));
//    }

    @Test
    public void verifyCaseWhenBothNumbersAreZero(){
        int expectedResult = 0;
        int a = 0, b = 0;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenSecondNumberIsOne(){
        int expectedResult = 10;
        int a = 10, b = 1;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }

    @Test
    public void verifyCaseWhenBothAreLargeNumbers(){
        int expectedResult = 4;
        int a = 10000, b = 2500;
        int actualResult = c.div(a, b);
        String message = "expected" + expectedResult + " : actual = " + actualResult;

        assertTrue(message,  expectedResult == actualResult);
    }
}
