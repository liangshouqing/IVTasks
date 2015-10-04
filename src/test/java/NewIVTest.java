/**
 * Created by SQL on 2015/9/29.
 */

import org.junit.*;

import static org.junit.Assert.*;

public class NewIVTest {

    NewIV niv = null;

    @Before public void setUp(){
        niv = new NewIV();
        System.out.println("Before for NewIVTest");
    }

    @After public void tearDown(){
        System.out.println("After for NewIVTest");
    }

    @Test public void testAdd(){
        int[] n1 = {1, 2};
        int[] n2 = {1, 1};

        int[] res = niv.add(n1, n2);

        assertEquals(res[0],0);
        assertEquals(res[1],2);
        assertEquals(res[2],3);

        int[] n3 = {9, 9};
        int[] n4 = {1};

        int[] res2 = niv.add(n3, n4);

        assertEquals(res2[0],1);
        assertEquals(res2[1],0);
        assertEquals(res2[2],0);


    }

    @Test public void testAddSameSize(){

        int[] n1 = {1, 2};
        int[] n2 = {1, 1};

        int[] res = niv.addSameSize(n1, n2);

        assertEquals(res[0],0);
        assertEquals(res[1],2);
        assertEquals(res[2], 3);

    }

    @Test public void testExpandArr(){

        int[] n1 = {1, 2};

        int[] res = niv.expandArray(n1, 5);

        assertEquals(res[0],0);
        assertEquals(res[1],0);
        assertEquals(res[2],0);
        assertEquals(res[3],1);
        assertEquals(res[4],2);

    }



    @Test public void testMethod1(){
        assertEquals(niv.method1(), 0);
    }
}
