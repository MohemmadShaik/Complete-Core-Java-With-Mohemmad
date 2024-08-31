//10. Patterns Part 1

/* 
// 10.1 Program 1 : To print STAR pattern  (Nested loops)
public class PatternPart_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("\n");
        }
    }
}

*/

// 10.2Program : print inverted-star pattern

//Logic -1 : 
/* 
public class PatternPart_1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j <= 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
 */

//Logic 2 :
/* 
public class PatternPart_1 {

    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<= (n-i+1) ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
*/

// 10.3 Program : Print HALF-PYRAMID pattern
/* 
public class PatternPart_1 {

    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
    */

// Program 10.4 : Print CHARACTER pattern
public class PatternPart_1 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
