package point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {
    private String input;
    private List<String> strListXY;
    private ArrayList<Integer> valueXY;  //좌표를 추출하는 결과값

    public void setting(String input){  //문자열에서 좌표값만 추출

        input = input.substring(1,input.length()-1);
        input = input.replaceAll(" ", "");

        valueXY = new ArrayList<>(2);
        valueXY.add(0,0); valueXY.add(1,0); //초기값 0으로 세팅

        strListXY = Arrays.asList(input.split("\\s*,\\s*"));
    }

    public ArrayList<Integer> xyCoordinate(String input){

        setting(input);
        int value;

        for (int i =0;i<strListXY.size()&&i<2;i++){   //길이 최대 2개

            if(!strListXY.get(i).equals("")) { //빈 값이 아닐때
                value=Integer.parseInt(strListXY.get(i));
                if(value<=0||value>=25) value=-1; // 범위를 넘어가면 -1을 넣어줌
                valueXY.set(i,value);
            }
        }
        return valueXY;
    }

}
