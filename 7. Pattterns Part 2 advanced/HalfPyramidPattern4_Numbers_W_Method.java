// To print the below pattern using method

/*   1 2 3 4 5
     1 2 3 4
     1 2 3 
     1 2 
     1 
*/

class HalfPyramidPatternNumbers1_W_Method {
    public static void patternNumbers1_W_Method(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        patternNumbers1_W_Method(7);
    }
}