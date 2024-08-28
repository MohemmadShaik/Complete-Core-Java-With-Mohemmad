/* Q3 : Write a program to input week number(1-7) and
        print day of week name using switch case. */

import java.util.Scanner;

 public class JCondStmtPQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number between 1 to 7 : ");
         int week =sc.nextInt();
         switch (week) {
            case 1: System.out.println("SUNDAY");
                    break;
            case 2: System.out.println("MONDAY");
                    break;
            case 3: System.out.println("TUESDAY");
                    break;
            case 4: System.out.println("WEDNESDAY");
                    break;
            case 5: System.out.println("THURSDAY");
                    break;
            case 6: System.out.println("FRIDAY");
                    break;
            case 7: System.out.println("SATURDAY");
                    break;
            default: System.out.println("Sorry , Only 1 to 7 numbers are allowed");
                    break;
         }
         sc.close(); //close the scanner to avoid resource leaks.
    }
}
