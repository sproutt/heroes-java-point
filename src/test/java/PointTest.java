import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void testPointValIsOne() {
        Point point = new Point("(3,)");

        for (int tmp : point.getXY()) {
            assertEquals(tmp, 0);
        }

        System.out.println("Value is one. " + point.getPoint());
    }

    @Test
    public void testPointValOverTwo() {
        Point point = new Point("(8, 10, 11)");

        assertThat(point.getXY().size()).isLessThanOrEqualTo(2);

        System.out.println("Values are more than two. " + point.getPoint());
    }

    @Test
    public void testPointRangeValuable() {
        Point point = new Point("(25, 1)");

        assertEquals(point.getXY().get(0).intValue(), 0);
        assertThat(point.getXY().get(1)).isEqualTo(1);

        System.out.println("Value is out of range. " + point.getPoint());
    }

}