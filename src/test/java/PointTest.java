import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PointTest {

    @Test
    public void result() {

    }

    @Test
    public void TestOne(){
        Point point = new Point("(,10)");
        assertEquals(point.result("(,10)"),"(0,10)");
        System.out.println("Just One Write.");
        System.out.println(point);
    }

    @Test
    public void TestTwo(){
        Point point = new Point("(8,10,11)");
        assertEquals(point.result("(8,10,11)"),"(8,10)");
        System.out.println("More than Two");
        System.out.println(point);
    }

    @Test
    public void TestThree(){
        Point point = new Point("(8,25)");
        assertEquals(point.result("(8,25)"),"(8,0)");
        System.out.println("Not Valid");
        System.out.println(point);
    }

}
