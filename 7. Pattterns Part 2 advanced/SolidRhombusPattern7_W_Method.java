//Pattern7 : Solid Rhombus using method

/* 
             *****
            *****
           *****
          *****
         *****

*/

class SolidRhombusPattern7_W_Method {
    public static void solidRhombus(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // 1st inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 2nd inner loop for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
