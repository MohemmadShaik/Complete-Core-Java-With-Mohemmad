/*
  To print Equilateral triangle having alphabets which were given by user the below pattern : 

                        C 
                      o d i 
                    n g i s m 
                  y p a s s i o 
                n C o d i n g i s
 */

 public class EquilateralTrianglePattern12_Alphabets_W_Method {
    public static void interv(int n) {
        String str = "Codingismypassion";
        int len = str.length();
        int charIndex = 0;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop : space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop : string value
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(str.charAt(charIndex) + " ");
                charIndex = (charIndex + 1) % len;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        interv(5);
    }
}
