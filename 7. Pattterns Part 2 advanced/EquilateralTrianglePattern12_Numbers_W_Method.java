/*
  To print Equilateral triangle pattern with numbers : 
  Printing j values here : 
                                 1 
                               1 2 3
                             1 2 3 4 5
                           1 2 3 4 5 6 7
                         1 2 3 4 5 6 7 8 9

    Printing i values here : 
                                 1 
                               2 2 2 
                             3 3 3 3 3 
                           4 4 4 4 4 4 4 
                         5 5 5 5 5 5 5 5 5 
  
  Key Note : NumberPyramidPattern10_W_Method.java is also quite similar just go through once.
 */

 public class EquilateralTrianglePattern12_Numbers_W_Method{
    public static void interv(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop : space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop : string value
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        interv(5);
    }
}
