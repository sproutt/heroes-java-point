package point;
import java.util.Scanner;

public class Point {

    private String rawtxt;
    private int x;
    private int y;

    private String getInput(){
        rawtxt = new Scanner(System.in).nextLine();
        return rawtxt;
    }

    public static boolean isValidInput(String txt){
        return txt.matches("^[(]([1-9]|[1-2][0-4])[,]([1-9]|[1-2][0-4])[)]$");
    }
    public void extractPoint(){

    }
    public static void main(String[] args){
//        Point po = new Point();
//        System.out.println(po.getInput());
        System.out.println(isValidInput("(1,1)"));
        System.out.println(isValidInput("(1,32)"));
    }
}