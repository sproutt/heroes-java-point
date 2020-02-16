package point;

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {
    private List<String> inputCoordinate;
    private List<Integer> valueXY;

    private void setInput(String input) {
        input = input.substring(1, input.length() - 1);
        input = input.replaceAll(" ", "");
        inputCoordinate = Arrays.asList(input.split("\\s*,\\s*"));
        valueXY = new ArrayList<>(2);

        valueXY.add(0, 0);
        valueXY.add(1, 0);

    }

    public List<Integer> extractXY(String input) {
        int value;

        setInput(input);

        for (int i = 0; i < inputCoordinate.size() && i < 2; i++) {
            if (!inputCoordinate.get(i).equals("")) {
                value = Integer.parseInt(inputCoordinate.get(i));
                if (value <= 0 || value >= 25) {
                    value = -1;
                }
                valueXY.set(i, value);
            }
        }
        return valueXY;
    }
}
