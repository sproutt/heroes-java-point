import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;

public class Extractor {

    int[] digits;
    int x;
    int y;

    int[] Extract(String str) {

        String restr = str.replaceAll("[^0-9,]","");

        digits = Stream.of(restr.split(",")).mapToInt(Integer::parseInt).toArray();

        //출처: https://zetawiki.com/wiki/%EC%9E%90%EB%B0%94_String_%EC%88%AB%EC%9E%90%EB%A5%BC_%EC%9E%90%EB%A6%BF%EC%88%98_int_%EB%B0%B0%EC%97%B4%EB%A1%9C_%EB%B6%84%ED%95%A0


        if (digits.length < 2)
        {
            int[] ErrorValue = {0,0};

            return ErrorValue;


        } else if (digits.length > 2)
        {
            int[] ErrorValue = {0,0};

            return ErrorValue;
        }

        if (digits[0] > 25 || digits[0] < 1)
        {
            int[] ErrorValue = {0,0};

            return ErrorValue;
        }

        if (digits[1] > 25 || digits[1] < 1)
        {
            int[] ErrorValue = {0,0};

            return ErrorValue;
        }

        x = digits[0];
        y = digits[1];

        return digits;




    }

}