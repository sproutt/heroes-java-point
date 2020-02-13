package point;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PointTest {
    private Point point;

    @Before
    public void setUp(){
        point=new Point();
    }

    @Test
    public void testSingle() {
        //값이 안들어간 좌표에는 0을 넣어준다.
        assertEquals(point.singleData("(12, )"),"x:"+12+", y:"+0);
        assertEquals(point.singleData("( ,14)"),"x:"+0+", y:"+14);
    }


    @Test
    public void testMore() {
        //맨 처음 2개의 값만 추출한다.
        assertEquals(point.moreData("(12,11,10,9)"),"x:"+12+", y:"+11);
        assertEquals(point.moreData("(1,2,6)"),"x:"+1+", y:"+2);
        assertEquals(point.moreData("(19,7)"),"x:"+19+", y:"+7);
    }

    @Test
    public void testInvalid(){
        //유효하지 않는 좌표에는 -1를 넣어준다.
        assertEquals(point.invalidData("(-46,123)"),"x:"+-1+", y:"+-1);
        assertEquals(point.invalidData("(0, 4)"),"x:"+-1+", y:"+4);
        assertEquals(point.invalidData("(6,25)"),"x:"+6+", y:"+-1);
    }
}