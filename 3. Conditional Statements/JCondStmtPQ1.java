/* Q1 : Write a java program to get a number from the user and print whether it is positive or negative */

import java.util.Scanner;
public class JCondStmtPQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To check given number is +ve or -ve ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.print("Enter Number here : ");
        int number = sc.nextInt();

        if(number>=0){
            System.out.println(number+" is Positive Number");
        }else{
            System.out.println(number+" is a Negative Number");
        }
        sc.close();
    }
    
}
