import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class mission0Test {
    Mission0 m;

    @Before
    public void setUp() throws Exception {
        m = new Mission0();
    }

    @After
    public void tearDown() throws Exception {
        m = null;
    }

    @Test
    public void 하나의_입력만_받았을_경우_예외처리된다() {
        assertEquals("fail", m.readCoordinates("(1, )"));
        assertEquals("fail", m.readCoordinates("( , 1)"));
    }

    @Test
    public void 정상적인_입력을_받았을_경우_두개값이_출력된다() {
        assertEquals("x = 1, y = 1", m.readCoordinates("(1, 1)"));
        assertEquals("x = 24, y = 24", m.readCoordinates("(24, 24)"));
    }

    @Test
    public void 범위_바깥의_입력을_받았을_경우_예외처리된다() {
        assertEquals("fail", m.readCoordinates("(0, 0)"));
        assertEquals("fail", m.readCoordinates("(25, 25)"));
    }
}