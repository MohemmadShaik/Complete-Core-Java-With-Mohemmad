// Pattern6 : Butterfly pattern using method 

/* 

        *      * 
		**    **
		***  *** 
		********
		********
		***  ***
		**    **
		*      *
		

*/

class ButterflyPattern6_W_Method {
    public static void butterflyPattern(int n) {
        // 1st half : Outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // Step1 : Print stars --> i value
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Step2 : Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Step3 : Print stars --> i value
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half : Outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            // Step1 : Print stars --> i value
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Step2 : Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Step3 : Print stars --> i value
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(3);
    }
}