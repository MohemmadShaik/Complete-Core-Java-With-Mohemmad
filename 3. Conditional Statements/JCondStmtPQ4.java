/* Q4 : what will be the value of x & y in the following program */

public class JCondStmtPQ4 {
    public static void main(String[] args) {

        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false; // output : x = false
        int y = (a > b) ? a : b; // output : y = 63
        System.out.print("x :"+x+" and  y : "+y);
    }
}
