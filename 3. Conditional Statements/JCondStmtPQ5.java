/* Q5 : Write a program that takes a year from the user and print whether that year is a leap year or not. 
 
Note : Three conditions must satisfy to tell that a year is a leap year or not.

  a. year must divisible by 4
  b. year should not be divisible by 100
  c. If a year divisible by 100 then it should be divisible by 400 as well 
 
*/
import java.util.Scanner;
public class JCondStmtPQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year :");
        int year=sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
        sc.close();//close the scanner to avoid resource leaks.
    }
    
}
