//Program 2: Addition of 2 numbers with and with out using functions

//part 1 : main branch ==> without using function (i.e Simple basic sum program ).
/* Note : 1. we are in main branch
          2. git commit -m "Part 1 : without using function (i.e Simple basic sum program )." */

//Part 2 : using feature1 branch ==> using function but without passing any arguments and return type.
/* Note : 1. We are in feature1 branch.
          2. Updated the MyFuncGitBranches.txt with feature1 branch.
          3. git commit -m "Part 2 : feature1 ==> using function without passing any arguments and return type completed successfully."
          4. switched to main branch and then merged with the feature1 changes into the main branch.
          5. Finally pushed the latesh main program into the Github repository.
*/

//Part 3 : feature2 branch ==> using function by passing the arguments but with no return type.
/*Note : 1. We are in feature2 branch.
         2. Updated the MyFuncGitBranches.txt with feature2 branch.
         3. git commit -m "Completed Part 3 : feature2 branch ==> using function by passing the arguments but with no return type."
         4. switched to main branch and then merged with the feature2 changes into the main branch.
         5. Finally pushed the latesh main program into the Github repository.
 */

import java.util.Scanner;

public class MyFuncGitBranches {

    public static void hello(){
        System.out.println("Hello World Am Hazarudin here exploring function/methods  concepts.....");
    }
     //function with no arguments and no return type.
    public static void calculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+" is : "+sum);
        
    }
    public static void main(String[] args) {
        //hello();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        calculateSum(a,b); //function calling

        sc.close();
    }
}


