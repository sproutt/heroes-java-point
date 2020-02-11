import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class ExtractorTest {

    Extractor extractor;

    String expression;

    @Before
    public void setup(){
        extractor = new Extractor();
        expression = "(8,10)";
    }

    @Test
    public void testOneCoordinates(){
        assertThat(extractor.extractCoordinate(expression).size()).isNotEqualTo(1);
    }

    @Test
    public void testMoreThanTwoCoordinate(){
        assertThat(extractor.extractCoordinate(expression).size())
                .isLessThanOrEqualTo(2);
    }

    @Test
    public void testCoordinatesValues(){
        for(Integer number:extractor.extractCoordinate(expression))
            assertThat(number).isBetween(1,24);
    }
}