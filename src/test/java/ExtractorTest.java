import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class ExtractorTest {

    private Extractor extractor;

    @Before
    public void setup() {
        extractor = new Extractor();
    }

    @Test
    public void 하나의인자가들어왔을때테스트() throws Exception {
        assertThatThrownBy(() -> {
            extractor.extractCoordinate("(3)");
        }).isInstanceOf(OutOfCoordinateNumberException.class);
    }

    @Test
    public void 두개의인자가들어왔을때테스트() throws Exception {
        assertThat(extractor.extractCoordinate("(3,4)"))
                .isEqualTo(new ArrayList<Integer>(Arrays.asList(3, 4)));
    }

    @Test
    public void 세개이상의인자가들어왔을때테스트() throws Exception {
        assertThatThrownBy(() -> {
            extractor.extractCoordinate("(3,4,5)");
        }).isInstanceOf(OutOfCoordinateNumberException.class);
    }


    @Test
    public void 메소드인자의값범위테스트() throws Exception {
        assertThatThrownBy(() -> {
            extractor.extractCoordinate("(1,25)");
        }).isInstanceOf(OutOfCoordinateValueException.class);
    }

}