import java.util.ArrayList;

public class Point {
    private int x;
    private int y;
    private String point;
    private ArrayList<Integer> pointNums = new ArrayList<>();

    Point(int x, int y) {
        setX(x);
        setY(y);
        pointNums.add(x);
        pointNums.add(y);
    }

    Point(String point) {
        this.point = point;
        extractPointNums();
    }

    public void setX(int x) {
        if (checkOutOfRange(x)) {
            // x가 유효한 값이 아니면 0으로 세팅
            this.x = 0;
        } else {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (checkOutOfRange(y)) {
            // y가 유효한 값이 아니면 0으로 세팅
            this.y = 0;
        } else {
            this.y = y;
        }
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public ArrayList<Integer> getXY() {
        return pointNums;
    }

    public Point getPoint() {
        return new Point(x, y);
    }

    public boolean checkOutOfRange(int x) {
        return x < 1 || x > 24;
    }

    private void extractPointNums() {
        // String 값 중 ( ) 공백 제거 후 , 기준으로 문자열 분리
        String[] tmp = point.replaceAll(" ", "")
                .replace("(","").replace(")", "").split(",");

        // arraylist에 숫자들만 추가
        for (String pt : tmp) {
            if (!pt.isEmpty()) {
                pointNums.add(Integer.parseInt(pt));
            }
        }

        if (pointNums.size() == 1) {
            // 값이 1개이면 (0,0)으로 세팅
            this.x = 0;
            this.y = 0;
        } else {
            // 값이 2개 이상이면 앞에 있는 두개의 값으로 세팅
            setXY(pointNums.get(0), pointNums.get(1));
        }

        // arraylist에 유효한 x,y 값으로 다시 넣기
        pointNums.clear();
        pointNums.add(x);
        pointNums.add(y);

    }

    @Override
    public String toString() {
        return "Point : (" +
                x + "," +
                y +
                ")";
    }
}
