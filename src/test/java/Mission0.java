import java.lang.*;

public class Mission0 {
    public int stringToInteger(String str) {
        String num = str.replaceAll("[^0-9]", "");
        int a;
        if(num.equals("")) a = 0;
        else a = Integer.parseInt(num);
        return a;
    }
    public String readCoordinates(String str) {
        String[] xy = str.split(",");
        int x = stringToInteger(xy[0]);
        int y = stringToInteger(xy[1]);
        if (x >= 1 && x <= 24 && y >= 1 && y <= 24) {
            return "x = " + x + ", "+ "y = " + y;
        }
        else {
            return "fail";
        }
    }
}