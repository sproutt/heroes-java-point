import java.util.ArrayList;

public class Point {
    private static int x;
    private static int y;
    private String point;

    public Point(String point) {
        this.point = point;
    }

    public String getPoint(int x, int y) {
        return point;
    }

    public static String result(String str) {
        String restr = str.replaceAll("[^0-9,]", "");
        String[] splitStr = restr.split(",");
        ArrayList<String> list = new ArrayList<String>();

        int idx = restr.indexOf(",");
        String num1 = restr.substring(0, idx);
        String num2 = restr.substring(idx + 1);

        for (String string : splitStr) {
            if (!string.isEmpty()){
                list.add(string);
            }

        }

        if (num1.isEmpty()) { // y만 적혔을 때. 값이 한 개 있을 때.
            x = 0;
            y = Integer.parseInt(list.get(0));
        } else if (num2.isEmpty()) { // x만 적혔을 때.
            x = Integer.parseInt(list.get(0));
            y = 0;
        } else {
            x = Integer.parseInt(list.get(0));
            y = Integer.parseInt(list.get(1));
        }

        if (list.size() >= 2) { //TestTwo.
            if (1 <= x && x <= 24 && 1 <= y && y <= 24) { //유효범위 안인지 확인하는 코드. 범위 안이면, 앞에 것 2개 출력.
                x = Integer.parseInt(list.get(0));
                y = Integer.parseInt(list.get(1));
                for (int i = 0; i < splitStr.length; i++) {
                    list.add(splitStr[i]);
                }
            } else { //TestThree. 유효하지 않은 값 넣었을 때.
                if (x < 1 || x > 24) {
                    if (y >= 1 && y <= 24) {
                        x = 0;
                        y = Integer.parseInt(list.get(1));
                    } else {
                        x = 0;
                        y = 0;
                    }
                } else {
                    if (y >= 1 && y <= 24) {
                        x = Integer.parseInt(list.get(0));
                        y = Integer.parseInt(list.get(1));
                    } else {
                        x = Integer.parseInt(list.get(0));
                        y = 0;
                    }
                }
            }
        }
        return "(" + x + "," + y + ")";
    }
}