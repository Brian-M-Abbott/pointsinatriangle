package io.lethalweapon.com;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brianabbott on 6/10/16.
 */
public class TriangleTest {

    @Test
    public void  triangleConstructorTest(){
        Triangle triangle = new Triangle(3,1,7,1,5,5);
        assertNotNull(triangle);
    }

}
