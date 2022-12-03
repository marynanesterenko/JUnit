package class02;

import class01.Calculator;
import org.junit.After;
import org.junit.Before;

/*
BaseTest we can write down here everything we are using in every Class
 */
public class BaseTest {
    // Declaration of object
    Calculator c ;

    // Pre-condition
    @Before
    public void setUp(){
        // Initialization of Object
        c = new Calculator();
    }

    @After
    public void cleanUp(){
        // clean up activity
        // garbage collector / generally - nobody is using it
        System.gc();
    }

}
