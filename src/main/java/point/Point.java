package point;

public class Point {

    private int x;
    private int y;

    Point(){ }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    static boolean isValidInput(String txt){
        return txt.matches("^[(]([1-9]|[1-2][0-4])[,]([1-9]|[1-2][0-4])[)]$");
    }

    static Point extract(String txt){

        Point point = new Point();

        if (isValidInput(txt)){
            point.x = Integer.parseInt(txt.substring(1, txt.indexOf(',')));
            point.y = Integer.parseInt(txt.substring(txt.indexOf(',')+1, txt.length()-1));
            return point;
        } else {
            return null;
        }
    }

    public static void main(String[] args){
    }
}