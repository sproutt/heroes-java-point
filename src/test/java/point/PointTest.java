package point;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
//import org.junit.After;
//import org.junit.Before;

public class PointTest {

//    @Before
//    public void setUp() { }

    @Test
    public void isValidInput_Normal() {
        assertTrue(new Point("(1,1)").isValidInput());
        assertTrue(new Point("(12,1)").isValidInput());
        assertTrue(new Point("(12,12)").isValidInput());
        assertTrue(new Point("(1,24)").isValidInput());
        assertTrue(new Point("(24,1)").isValidInput());
        assertTrue(new Point("(24,24)").isValidInput());
    }

    @Test
    public void isValidInput_OnlyOne() {
        // Case 1 - x, y 좌표 값 하나만 입력하는 경우
        assertFalse(new Point("(1,)").isValidInput());
        assertFalse(new Point("(,1)").isValidInput());
        assertFalse(new Point("(12,)").isValidInput());
        assertFalse(new Point("(,12)").isValidInput());
        assertFalse(new Point("(1)").isValidInput());
        assertFalse(new Point("1,)").isValidInput());
        assertFalse(new Point("(,1)").isValidInput());
    }

    @Test
    public void isValidInput_MoreThanTwo() {
        // Case 2 - x, y 좌표 값 하나만 입력하는 경우
        assertFalse(new Point("(1,2,3)").isValidInput());
        assertFalse(new Point("(3,3,5,1)").isValidInput());
    }

    @Test
    public void isValidInput_InvalidValue() {
        // Case 3 - 유효하지 않은 값을 입력하는 경우
        assertFalse(new Point("(0,0)").isValidInput());
        assertFalse(new Point("(0,25)").isValidInput());
        assertFalse(new Point("(25,0)").isValidInput());
        assertFalse(new Point("(25,25)").isValidInput());
        assertFalse(new Point("(-1,0)").isValidInput());
        assertFalse(new Point("(0,-1)").isValidInput());
        assertFalse(new Point("(-25,0)").isValidInput());
        assertFalse(new Point("(-25,-25)").isValidInput());
        assertFalse(new Point("(100,1)").isValidInput());
        assertFalse(new Point("(1,100)").isValidInput());
        assertFalse(new Point("(100,100)").isValidInput());
    }

    @Test
    public void extractCoordinates() throws Exception {
        Point point = new Point("(2,3)");
        point.extractCoordinates();
        assertEquals(2, point.getX());
        assertThat(point.getY()).isEqualTo(3);

        point = new Point("(211,3)");
        point.extractCoordinates();
    }

//    @After
//    public void tearDown() { }

}