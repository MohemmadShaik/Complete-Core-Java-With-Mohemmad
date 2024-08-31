//10. Patterns Part 1

/* 
// Program 1 : To print STAR pattern  (Nested loops)
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

//Program 2 : print inverted-star pattern

public class PatternPart_1 {

    public static void main(String[] args) {
        for(int i =1; i<=4; i++){
            for(int j=1; j<=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}