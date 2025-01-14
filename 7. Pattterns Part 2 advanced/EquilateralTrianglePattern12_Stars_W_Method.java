/*
  To print Equilateral triangle pattern with stars : 

                    * 
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
 */

 public class EquilateralTrianglePattern12_Stars_W_Method {
    public static void interv(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop : space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop : string value
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        interv(5);
    }
}
