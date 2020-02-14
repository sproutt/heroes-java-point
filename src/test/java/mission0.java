import java.util.*;
import java.lang.*;

public class mission0 {
//    public String setScanner() {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        return str;
//    }
    public String readCoords(String str) {
        String[] xy = str.split(",");
        int x, y;
        if(xy[0].replaceAll("[^0-9]", "").equals("")) {
            x = 0;
        }
        else {
            x = Integer.parseInt(xy[0].replaceAll("[^0-9]", ""));
        }
        if (xy[1].replaceAll("[^0-9]", "").equals("")) {
            y = 0;
        }
        else {
            y = Integer.parseInt(xy[1].replaceAll("[^0-9]", ""));
        }
        if (x >= 1 && x <= 24 && y >= 1 && y <= 24) {
            return "x = " + x + ", "+ "y = " + y;
        }
        else {
            return "fail";
        }
    }
}