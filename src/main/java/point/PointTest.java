package point;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

    Point po;

    @Before
    public void setUp() {
        po = new Point();
    }

    @Test
    public void isValidInput() {

        assertTrue(Point.isValidInput("(1,1)"));
        assertTrue(Point.isValidInput("(12,1)"));
        assertTrue(Point.isValidInput("(1,12)"));
        assertTrue(Point.isValidInput("(12,12)"));
        assertTrue(Point.isValidInput("(1,24)"));
        assertTrue(Point.isValidInput("(24,1)"));
        assertTrue(Point.isValidInput("(24,24)"));

        // Case 1
        assertFalse(Point.isValidInput("(1,)"));
        assertFalse(Point.isValidInput("(,1)"));
        assertFalse(Point.isValidInput("(12,)"));
        assertFalse(Point.isValidInput("(,12)"));
        assertFalse(Point.isValidInput("(1)"));
        assertFalse(Point.isValidInput("1,)"));
        assertFalse(Point.isValidInput("(,1"));

        // Case 2
        assertFalse(Point.isValidInput("(1,2,3)"));
        assertFalse(Point.isValidInput("(3,3,5,1)"));

        // Case 3
        assertFalse(Point.isValidInput("(0,0)"));
        assertFalse(Point.isValidInput("(0,25)"));
        assertFalse(Point.isValidInput("(25,0)"));
        assertFalse(Point.isValidInput("(25,25)"));
        assertFalse(Point.isValidInput("(-1,0)"));
        assertFalse(Point.isValidInput("(0,-1)"));
        assertFalse(Point.isValidInput("(-25,0)"));
        assertFalse(Point.isValidInput("(-25,-25)"));
        assertFalse(Point.isValidInput("(100,1)"));
        assertFalse(Point.isValidInput("(1,100)"));
        assertFalse(Point.isValidInput("(100,100)"));
    }

    @Test
    public void extract() {
        assertNull(Point.extract("(1,"));
        assertNull(Point.extract("(0,1)"));
        assertNull(Point.extract("(25,1)"));
        assertNull(Point.extract("(100,21)"));
        assertNull(Point.extract("(1,1,4)"));
        assertNull(Point.extract("12"));

//        assertEquals(Point.extract("(1,2)"), new Point(1,2));
//        assertEquals(new Point(1,24), Point.extract("(1,24)"));
//        assertEquals(new Point(24,7), Point.extract("(24,7)"));
    }

    @After
    public void tearDown() {
    }
}