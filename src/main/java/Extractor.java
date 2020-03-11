import java.util.ArrayList;
import java.util.List;

public class Extractor {
    public List<Integer> extractCoordinate(String expression) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        for (String element : expression.split("\\(|,|\\)")) {
            if(!element.isEmpty()) {
                numbers.add(Integer.valueOf(element));
            }
        }
        if(numbers.size() != 2) {
            throw new OutOfCoordinateNumberException("메소드의 인자 수가 2개가 아닙니다.");
        }
        for(Integer coordinate : numbers){
            if(coordinate > 24 || coordinate < 1) {
                throw new OutOfCoordinateValueException("메소드 인자의 값이 1이상 24이하가 아닙니다.");
            }
        }
        return numbers;
    }


}