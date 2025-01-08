/* Number Pyramid Pattern

          1
		 2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5

*/

class NumberPyramidPattern10_W_Method {
    public static void numberPyr(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPyr(5);
    }
}
