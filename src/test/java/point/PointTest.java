package point;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PointTest {

    private Point point;
    private ArrayList<Integer> result;

    @Before
    public void setUp(){
        point=new Point();
        result = new ArrayList<>(2);
        result.add(0,0); result.add(1,0);
    }

    @Test
    public void testSingle() {
        //값이 안들어간 좌표에는 0을 넣어준다.
        result.set(0,12); result.set(1,0);
        assertEquals(point.xyCoordinate("(12, )"),result);

        result.set(0,0); result.set(1,14);
        assertEquals(point.xyCoordinate("( ,14)"),result);
    }


    @Test
    public void testMore() {
        //맨 처음 2개의 값만 추출한다.
        result.set(0,12); result.set(1,11);
        assertEquals(point.xyCoordinate("(12,11,10,9)"),result);

        result.set(0,1); result.set(1,2);
        assertEquals(point.xyCoordinate("(1,2,6)"),result);

        result.set(0,19); result.set(1,7);
        assertEquals(point.xyCoordinate("(19,7)"),result);
    }

    @Test
    public void testInvalid(){
        //유효하지 않는 좌표에는 -1를 넣어준다.
        result.set(0,-1); result.set(1,-1);
        assertEquals(point.xyCoordinate("(-46,123)"),result);

        result.set(0,-1); result.set(1,4);
        assertEquals(point.xyCoordinate("(0, 4)"),result);

        result.set(0,6); result.set(1,-1);
        assertEquals(point.xyCoordinate("(6,25)"),result);
    }
}