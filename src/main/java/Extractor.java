import java.util.ArrayList;

public class Extractor {
    public ArrayList<Integer> extractCoordinate(String expression) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (String element : expression.split("\\(|,|\\)")) {
            if (!element.isEmpty())
                numbers.add(Integer.valueOf(element));
        }
        return numbers;
    }
}