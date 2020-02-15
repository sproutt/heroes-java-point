import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PointExtractor {
    private int x = 0;
    private int y = 0;
    private String point;

    PointExtractor(String point) {
        this.point = point;
    }

    public void setX(int x) {
        if (checkValueOutOfRange(x)) {
            this.x = 0;
        } else {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (checkValueOutOfRange(y)) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public String extractValidPoint() {
        String parenthesisRemovedPoint = point.replaceAll(" ", "")
                .replace("(", "").replace(")", "");

        if (checkValuesEmpty(parenthesisRemovedPoint)) {
            parenthesisRemovedPoint = "0,0";
        }

        List<String> extractedPointNums = new ArrayList<>(Arrays.asList(parenthesisRemovedPoint.split(",")));

        if (parenthesisRemovedPoint.indexOf(",") == 0) {
            extractedPointNums.set(0, "0");
        }

        if (parenthesisRemovedPoint.indexOf(",") == parenthesisRemovedPoint.length() - 1) {
            extractedPointNums.add(extractedPointNums.size(), "0");
        }

        setXY(Integer.parseInt(extractedPointNums.get(0)), Integer.parseInt(extractedPointNums.get(1)));

        return "(" + x + "," + y + ")";
    }

    private boolean checkValueOutOfRange(int x) {
        return x < 1 || x > 24;
    }

    private boolean checkValuesEmpty(String string) {
        return string.equals(",") || string.isEmpty();
    }
}
