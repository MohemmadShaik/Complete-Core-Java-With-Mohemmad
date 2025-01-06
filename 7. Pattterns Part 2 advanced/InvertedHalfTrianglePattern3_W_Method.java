//Pattern3 : Inverted Half Triangle Pattern downwards With Method
/*   
                *   *  *   * 
                    *  *   * 
                       *   *
                           *
 */
// Inverted Half Trtiangle downwards Pattern With method

class InvertedHalfTrianglePattern3_W_Method {
    public static void bTest(int n) {
        for (int i = 1; i <= 5; i++) {
            // inner loop : print space
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            // inner loop : print star
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        bTest(4);
    }
}