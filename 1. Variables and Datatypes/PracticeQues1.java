/* Q1 : In a program , input 3 numbers : A, B and C. You have to O/P the avg of these 3 numbers.
           (Hint : Average of N numbers is sum of those number divided by N)
 */

import java.util.Scanner;

public class PracticeQues1 {

    public static void main(String[] args) {
        

         Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a value : ");
        int a = sc.nextInt();
        System.out.println("\n");
        System.out.print(" Enter b value : ");
        int b = sc.nextInt();
        System.out.println("\n");
        System.out.print(" Enter c value : ");
        int c = sc.nextInt();
        System.out.println("\n");
        int avg= (a+b+c)/3;
        System.out.println("---------------------------");
        System.out.println("Avg of "+a+" ,"+b+" ,"+c+" is : "+avg);
        System.out.println("---------------------------");

    }
    
}
