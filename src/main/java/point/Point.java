package point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
public class Point {

    private int x;
    private int y;
    private String input;
    private String[] arrayXY;

    public void setting(String input){
        String xy = input.substring(1,input.length()-1);
        xy = xy.replaceAll(" ", "");
       arrayXY = xy.split(",");

    }

    public String singleData(String input) {

        setting(input);

            //x,y중 하나의 좌표만 있는 경우 빈 곳에 0을 넣어준다.
        if(!arrayXY[0].equals("")){
           x = Integer.parseInt(arrayXY[0]);
           y=0;
            return "x:" + x + ", y:"+y;
        }
            y = Integer.parseInt(arrayXY[1]);
            x=0;
            return "x:"+x+", y:"+y;
    }




    public String moreData(String input) {
        setting(input);
        //2개 이상 들어간 경우 첫번째 좌표를 x,두번째 좌표를 y로 하여 2개의 값만 추출한다.
        x = Integer.parseInt(arrayXY[0]);
        y = Integer.parseInt(arrayXY[1]);

        return "x:" + x + ", y:"+y;
    }

    public String invalidData(String input) {
        setting(input);
        x = Integer.parseInt(arrayXY[0]);
        y = Integer.parseInt(arrayXY[1]);
        //유효하지 않는 좌표에 -1을 넣어준다.
        if(x<=0||x>=25) x=-1;
        if(y<=0||y>=25) y=-1;

        return "x:" + x + ", y:"+y;
    }




}
