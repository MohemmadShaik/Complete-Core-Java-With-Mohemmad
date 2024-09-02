//Program 2: Addition of 2 numbers with and with out using functions

//part 1 : main branch : without using function (i.e Simple basic sum program ).
/* Note : 1. we are in main branch
          2. git commit -m "Part 1 : without using function (i.e Simple basic sum program )." */

//Part 2 : using feature1 branch : using function but without passing any arguments and return type.

import java.util.Scanner;

public class MyFuncGitBranches {

    public static void hello(){
        System.out.println("Hello World Am Hazarudin here exploring function/methods  concepts.....");
    }
     //function with no arguments and no return type.
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
        sc.close();
    }
    public static void main(String[] args) {
        //hello();
        calculateSum(); //function calling
    }
}
