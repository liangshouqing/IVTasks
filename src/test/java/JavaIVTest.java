/**
 * Created by SQL on 2015/9/23.
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class JavaIVTest {

    //JavaIV jiv = null;

    @BeforeClass
    public void setUpClass(){
        System.out.println("setUp Class");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("tearDown Class");
    }

    @Before
    public void setUp(){
        System.out.println("before");
        //jiv = new JavaIV();
    }

    @After
    public void tearDown(){
        System.out.println("after");
    }

    @Test public void testJUnit(){
//        assertEquals(jiv.isValidatePurchase(10), true);
//        assertTrue(jiv.isValidatePurchase(10));
    }

    @Test public void testMultiPurs(){
//        assertEquals(jiv.isValidatePruchases("a", 400), true);
//        assertTrue(jiv.isValidatePruchases("a", 400));
//        assertFalse(jiv.isValidatePruchases("a", 400));
//        assertTrue(jiv.isValidatePruchases("b", 400));
//        assertTrue(jiv.isValidatePruchases("b", 400));
    }

    @Test public void printArr(){
//        jiv.initArray(jiv.getIntArr());
    }
}
