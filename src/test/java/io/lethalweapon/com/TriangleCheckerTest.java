package io.lethalweapon.com;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 6/10/16.
 */
public class TriangleCheckerTest {

    @Test
    public void checkTriangleTest(){
        TriangleChecker triangleChecker = new TriangleChecker();
        boolean expected = true;
        boolean actual = triangleChecker.check(3,1,7,1,5,5);
        assertEquals("The points should form a triangle",expected,actual);
    }

    @Test
    public void checkTriangleFalseTest(){
        TriangleChecker triangleChecker = new TriangleChecker();
        boolean expected = false;
        boolean actual = triangleChecker.check(0,0,2,0,4,0);
        assertEquals("The points should form a triangle",expected,actual);
    }

    @Test
    public void checkTriangleMadeTest(){
        TriangleChecker triangleChecker = new TriangleChecker();
        triangleChecker.check(3,1,7,1,5,5);
        assertNotNull(triangleChecker.currentTriangle);
    }

    @Test
    public void checkTriangleExtraPointTest(){
        TriangleChecker triangleChecker = new TriangleChecker();
        triangleChecker.check(3,1,7,1,5,5);
        assertTrue(triangleChecker.pointChecker(4,3));
    }

    @Test
    public void checkTriangleExtraPointFalseTest(){
        TriangleChecker triangleChecker = new TriangleChecker();
        triangleChecker.check(3,1,7,1,5,5);
        assertFalse(triangleChecker.pointChecker(1,1));
    }

    @Test
    public void outputAnswer0Test(){
        TriangleChecker triangleChecker = new TriangleChecker();
        int expected = 0;
        int actual = triangleChecker.outputAnswer(0,0,2,0,4,0,2,0,4,0);
        assertEquals(expected,actual);
    }

    @Test
    public void outputAnswer1Test(){
        TriangleChecker triangleChecker = new TriangleChecker();
        int expected = 1;
        int actual = triangleChecker.outputAnswer(3, 1,7,1,5,5,3,1,0,0);
        assertEquals(expected,actual);
    }

    @Test
    public void outputAnswer2Test(){
        TriangleChecker triangleChecker = new TriangleChecker();
        int expected = 2;
        int actual = triangleChecker.outputAnswer(3,1,7,1,5,5,1,1,4,3);
        assertEquals(expected,actual);
    }

    @Test
    public void outputAnswer3Test(){
        TriangleChecker triangleChecker = new TriangleChecker();
        int expected = 3;
        int actual = triangleChecker.outputAnswer(3,1,7,1,5,5,5,2,6,3);
        assertEquals(expected,actual);
    }

    @Test
    public void outputAnswer4Test(){
        TriangleChecker triangleChecker = new TriangleChecker();
        int expected = 4;
        int actual = triangleChecker.outputAnswer(3,1,7,1,5,5,1,1,2,2);
        assertEquals(expected,actual);
    }
}
