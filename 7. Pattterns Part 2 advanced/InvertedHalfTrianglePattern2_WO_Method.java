//Pattern2 : InvertedHalfTriangle pattern without using method.
/* InvertedHalfTriangle pattern :

					*
			    *	*
			*	* 	*
		*	* 	* 	*

*/

// Without using method
/* import java.util.Scanner;

class InvertedHalfTrianglePattern2_WO_Method {
    public static void main(String args[]) {
        System.out.print("Enter n value : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // outer loop
        for (int i = 1; i <= n; i++) {
            // to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // to print stars
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
} */