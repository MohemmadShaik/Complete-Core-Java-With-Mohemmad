//Q3 : Print the factorial of a number given by the user.
import java.util.Scanner;
public class JLoopsPQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int fact = 1;

        for( int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();// close the scanner to avoid resource leaks
    }
    
}
