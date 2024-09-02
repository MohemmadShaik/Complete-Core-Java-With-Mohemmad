//Program 1:
/* 
public class MyFunction {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    public static void main(String[] args) {

        printHelloWorld();//function call
    }
}
 */

 //Program 2: Addition of 2 numbers using function

 //Step 1 : Sum of 2 numbers without using function
import java.util.Scanner;

public class MyFunction {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a value : ");
        int a = sc.nextInt();
        System.out.print("Enter  b value : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is : "+sum);

        sc.close();// close the scanner to avoid resource leaks
    }
 }

