package point;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PointTest {
    private Point point;
    private List<Integer> result;

    @Before
    public void setUp() {
        point = new Point();
        result = new ArrayList<>(2);

        result.add(0, 0);
        result.add(1, 0);
    }

    @Test
    public void 한개_입력시_값이없는_좌표에_0을_넣어주는_Test() {
        result.set(0, 12);
        result.set(1, 0);
        assertEquals(point.extractXY("(12, )"), result);

        result.set(0, 0);
        result.set(1, 14);
        assertEquals(point.extractXY("( ,14)"), result);
    }


    @Test
    public void 두개이상_입력시_처음_2개값만_추출하는_Test() {
        result.set(0, 12);
        result.set(1, 11);
        assertEquals(point.extractXY("(12,11,10,9)"), result);

        result.set(0, 1);
        result.set(1, 2);
        assertEquals(point.extractXY("(1,2,6)"), result);

        result.set(0, 19);
        result.set(1, 7);
        assertEquals(point.extractXY("(19,7)"), result);
    }

    @Test
    public void 유효하지_않는_좌표에는_minus_one를_넣어주는_Test() {
        result.set(0, -1);
        result.set(1, -1);
        assertEquals(point.extractXY("(-46,123)"), result);

        result.set(0, -1);
        result.set(1, 4);
        assertEquals(point.extractXY("(0, 4)"), result);

        result.set(0, 6);
        result.set(1, -1);
        assertEquals(point.extractXY("(6,25)"), result);
    }
}