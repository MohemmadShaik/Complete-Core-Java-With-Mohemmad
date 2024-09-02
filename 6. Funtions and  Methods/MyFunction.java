
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

//PART 1 : Simple java program to calculate Sum of 2 numbers (i.e without using function)

/*  import java.util.Scanner;

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
*/

//PART 2 : Program to calculate Sum of 2 numbers using function without any return type and without passing any arguments.
/* 
import java.util.Scanner;

public class MyFunction {

 //method wihout any return type and witout arguments
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is : " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        calculateSum(); // without arguments
    }
}
*/

//Part 3 : Program to calculate Sum of 2 numbers by passing the arguments but with no return type

/* import java.util.Scanner;

public class MyFunction {
    // Passing the arguments with no return type
    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        calculateSum(a,b); //Passing the arguments 

        sc.close();
        
    }
}
    */

//Part 4 : Program to calculate Sum of 2 numbers by passing the arguments with return type

import java.util.Scanner;

public class MyFunction {
     // Passing arguments with returntype
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2; 
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int sum = calculateSum(a,b); //Passing the arguments
        System.out.println("Sum of " + a + " and " + b + " is : " + sum);
        sc.close();
    }
}