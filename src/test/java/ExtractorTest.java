import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExtractorTest {

    Extractor extract;

    @Before
    public void 객체_생성(){
        extract = new Extractor();
    }


    @Test
    public void 하나의_값(){
        int[] digits = {0,0};

        assertArrayEquals(digits, extract.Extract("(8,)"));
                //extract.Extract("(8,)").get(0),8;
    }

    @Test
    public void 두개_이상의_값(){
        int[] digits = {0,0};

        assertArrayEquals(digits, extract.Extract("(8,9,10)"));
    }

    @Test
    public void 유효하지_않은_값(){
        int[] digits = {0,0};

        assertArrayEquals(digits, extract.Extract("(100,100)"));
    }

    @After
    public void 메모리_프리(){
        extract = null;
    }
}