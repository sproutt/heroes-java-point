package point;

public class Point {

    private int x;
    private int y;

    public static boolean isValidInput(String txt){
        return txt.matches("^[(]([1-9]|[1-2][0-4])[,]([1-9]|[1-2][0-4])[)]$");
    }
    public int extractX(String txt){
        if (isValidInput(txt)){
            this.x = Integer.parseInt(txt.substring(1, txt.indexOf(',')));
            return this.x;
        } else {
            return -1;
        }
    }

    public int extractY(String txt){
        if (isValidInput(txt)){
            this.y = Integer.parseInt(txt.substring(txt.indexOf(',')+1, txt.length()-1));
            return this.y;
        } else {
            return -1;
        }
    }

    public static void main(String[] args){

    }
}