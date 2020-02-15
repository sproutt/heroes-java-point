package point;

class Point {

    private String rawString;
    private int x;
    private int y;

   Point(String rawString){
        this.rawString = rawString;
    }

    boolean isValidInput(){
        return this.rawString.matches("^[(]([1-9]|[1-2][0-4])[,]([1-9]|[1-2][0-4])[)]$");
    }

    private void extract() throws Exception {
        String txt = this.rawString;
        if (this.isValidInput()) {
            this.x = Integer.parseInt(txt.substring(1, txt.indexOf(',')));
            this.y = Integer.parseInt(txt.substring(txt.indexOf(',') + 1, txt.length() - 1));
        }
    }
}