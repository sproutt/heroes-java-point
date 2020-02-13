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
    public void extractX() {
        assertEquals(-1, po.extractX("(1,"));
        assertEquals(-1, po.extractX("(0,1)"));
        assertEquals(-1, po.extractX("(25,1)"));
        assertEquals(-1, po.extractX("(100,21)"));
        assertEquals(-1, po.extractX("(1,1,4)"));
        assertEquals(-1, po.extractX("12"));

        assertEquals(1, po.extractX("(1,2)"));
        assertEquals(1, po.extractX("(1,24)"));
        assertEquals(24, po.extractX("(24,7)"));
    }

    @Test
    public void extractY() {
        assertEquals(-1, po.extractY("(1,"));
        assertEquals(-1, po.extractY("(0,1)"));
        assertEquals(-1, po.extractY("(25,1)"));
        assertEquals(-1, po.extractY("(100,21)"));
        assertEquals(-1, po.extractY("(1,1,4)"));
        assertEquals(-1, po.extractY("12"));

        assertEquals(2, po.extractY("(1,2)"));
        assertEquals(24, po.extractY("(1,24)"));
        assertEquals(7, po.extractY("(24,7)"));
    }

    @After
    public void tearDown() {
        po = null;
    }
}