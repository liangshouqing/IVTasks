/**
 * Created by SQL on 2015/10/4.
 */
import org.junit.*;
import static org.junit.Assert.*;

public class ScyphoITestV {

    ScyphoIV scyphoIV = null;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("set up class");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tear down class");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        scyphoIV = new ScyphoIV();
    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

}
