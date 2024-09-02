//Program 2: Addition of 2 numbers with and with out using functions

//part 1 : main branch : without using function (i.e Simple basic sum program ).

import java.util.Scanner;

public class MyFuncGitBranches {
    public static void hello(){
        System.out.println("Hello World Am Hazarudin here exploring function/methods  concepts.....");
    }
    public static void main(String[] args) {
        //hello();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
        sc.close();

    }
}
