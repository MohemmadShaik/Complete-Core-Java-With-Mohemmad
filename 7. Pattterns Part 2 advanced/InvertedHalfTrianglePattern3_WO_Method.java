//Pattern3 : Inverted Half Triangle Pattern downwards WithOut Method
/*   
                *   *  *   * 
                    *  *   * 
                       *   *
                           *
 */
// Inverted Half Trtiangle downwards Pattern WithOut using method
import java.util.Scanner;
class InvertedHalfTrianglePattern3_WO_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter n value : ");
        int n = scanner.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
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
        scanner.close();
    }

}