import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mission0Test {
    mission0 m;

    @Before
    public void setUp() throws Exception {
        m = new mission0();
    }

    @After
    public void tearDown() throws Exception {
        m = null;
    }

    @Test
    public void case1() {
        assertEquals("fail", m.readCoords("(1, )"));
        assertEquals("fail", m.readCoords("( , 1)"));
    }

    @Test
    public void case2() {
        assertEquals("x = 1, y = 1", m.readCoords("(1, 1)"));
        assertEquals("x = 24, y = 24", m.readCoords("(24, 24)"));
    }

    @Test
    public void case3() {
        assertEquals("fail", m.readCoords("(0, 0)"));
        assertEquals("fail", m.readCoords("(25, 25)"));
    }
}