import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointExtractorTest {

    @Test
    public void testPointValIsOne() {
        assertEquals(new PointExtractor("(3, )").extractValidPoint(), "(3,0)");
        assertEquals(new PointExtractor("(,8)").extractValidPoint(), "(0,8)");
        assertEquals(new PointExtractor("(45,").extractValidPoint(), "(0,0)");
        assertEquals(new PointExtractor("(,)").extractValidPoint(), "(0,0)");
        assertEquals(new PointExtractor("()").extractValidPoint(), "(0,0)");
    }

    @Test
    public void testPointValOverTwo() {
        assertEquals(new PointExtractor("(8, 10, 11)").extractValidPoint(), "(8,10)");
        assertEquals(new PointExtractor("(3, 41, 3)").extractValidPoint(), "(3,0)");
        assertEquals(new PointExtractor("(34,25,4,2)").extractValidPoint(), "(0,0)");
    }

    @Test
    public void testPointRangeValuable() {
        assertEquals(new PointExtractor("(25, 1)").extractValidPoint(), "(0,1)");
        assertEquals(new PointExtractor("(8,44)").extractValidPoint(), "(8,0)");
    }

}