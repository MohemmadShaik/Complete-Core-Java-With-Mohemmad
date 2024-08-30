//Q4 : To print the multiplication table of a number given by the user.
import java.util.Scanner;
public class JLoopsPQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Multiplication table number : ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            int prod = n * i;
            System.out.println( n+" X "+i+" = "+prod);
        }
            sc.close();
    }
    
}
