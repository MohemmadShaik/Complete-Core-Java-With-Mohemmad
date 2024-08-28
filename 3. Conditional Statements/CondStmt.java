/* Program 1 : Simple if-else statement 
    =========
 
 // To print a number is +ve or -ve. 
public class CondStmt {
    public static void main(String[] args) {
        int number = 35;
        if(number>0){
            System.out.println("given number is +ve :"+number);
        }
        else{
            System.out.println("Given number is -ve : "+number);
        }
    }
}

*/

/* Program2 : if-else if-else Statement
   ========                                  
   public class CondStmt {
    public static void main(String[] args) {
        int number = -10;

        if (number > 0) {
            System.out.println("Its a +ve number : "+number);
        } else if (number < 0) {
            System.out.println("Its a -ve number : "+number);
        } else {
            System.out.println("The number is zero.");
        }
    }
}

*/



// Program3 : Print the largest among the 2 numbers 


/* public class CondStmt {

     public static void main(String[] args) {
        
        int a = 30;
        int b = 45;

        if (a>b){
            System.out.println(a+" is larger than "+b);
        }else{
            System.out.println(b+" is larger than "+a);
        }
     }
}

*/

/*  
// Program4 : Print if a number is Odd or Even

import java.util.Scanner;

public class CondStmt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int num= sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num+" is a Even Number.");
        }else{
            System.out.println(num+" is a Odd Number.");
        }
    }
}

*/

 
//Nested if-else Statement
 /*   Program5.1 : Based on the Age Condition write a program to 
      =========    find the current state of a person.
      Person state is Minor, Teenager , Adult or Senior Citizen.
      
   

import java.util.Scanner;

public class CondStmt {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();

        if(age<=12){
            System.out.println("Age : "+age+" He is a  Minor");
        } else if(age>=13 && age<=17){
            System.out.println("Age : "+age+" He is at Teenage");
        } else if(age>=18 && age<=50){
            System.out.println("Age : "+age+" He is an Adult");
        } else {
            System.out.println("Age : "+age+" He is a Senoir Citizen");
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
  
}

*/

/* 
//Program5.2 : Applying different logic for the same program 5.1 .                            

import java.util.Scanner;

public class CondStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age here : ");
        int age = sc.nextInt();
        
         if(age>12) {
                if (age >= 52) {
                    System.out.println("Age : "+age+" ==> Senior Citizen.");
                } else if (age >= 13 && age <= 17){
                System.out.println("Age : "+age+" ==> Teenager");
                }
                else {
                System.out.println("Age : "+age+" ==> Adult");
               }
        } else {
            System.out.println("Age : "+age+" ==> Minor");
        }

        sc.close(); //Close the scanner to avoid resource leaks
    }
}

*/  

 
//8.5 Program to calculate the income tax based on the below conditions :
/* income < 5L ==> 0% Tax , income between 5L to 10L ==> 20% Tax , income > 10L ==> 30% Tax */
/*
import java.util.Scanner;

public class CondStmt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income here : ");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }else if(income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }else{
            tax = (int) (income * 0.3);
        }
          System.out.println("Your Income : "+income+" and tax you need to pay : "+tax);
        sc.close();//Close the scanner to avoid resource leaks
    }
}
*/

/* 
// 8.5 Program : Applying different logic for the same program 
import java.util.Scanner;

public class CondStmt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Salary here : ");
        double sal = sc.nextDouble();

        if(sal > 500000){
            if (sal <= 1000000){
                System.out.println("The income tax on a salary of RS."+sal+" with 20% tax is : "+(sal * 0.2)+" RS");
            }else{
                System.out.println("The income tax on a salary of RS."+sal+" with 30% tax is : "+(sal * 0.3)+" RS");
            }
        }
        else
        {
         System.out.println( "The income tax on a salary of RS."+sal+" with 0% tax : "+sal+" RS");   
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
 */

//8.6 : Print the largest among 3 numbers 
/* 
import java.util.Scanner;
public class CondStmt{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter A value : ");
    int A = sc.nextInt();
    System.out.print("enter B value : ");
    int B = sc.nextInt();
    System.out.print("enter C value : ");
    int C = sc.nextInt();

    if (A >= B && A >= C){
        System.out.println("A is larger : "+ A); 
    }else if(B >= C){
        System.out.println("B is larger : "+B);
    }else{
        System.out.println("C is larger : "+C);
    }

    sc.close(); // Close the scanner to avoid resource leaks

   }  
}
*/

//8.7 Ternary Operator

/*/*  public class CondStmt{
    public static void main(String[] args) {

    //Program 1 : To print even or odd number
         int number = 0;
        //ternary operator
        String type = ((number%2)==0) ? "even" : "odd";
        System.out.println(type); 

        //Program 2 : Check if a student will pass or Fail ( marks>=33 ==> pass , marks<33 ==> Fail)
            int marks = 32;
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(result);

    }
}
*/
//8.7 Switch Statement
/*  
public class CondStmt {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 1: System.out.println("Veg Puff");
                    break;
            case 2: System.out.println("Egg Puff");
                     break;
            case 3: System.out.println("Paneer Puff");
                    break;
            default : System.out.println("We Wake up");
            
        }
    }
}
*/

//Program 2 : 
/* 
public class CondStmt {
    public static void main(String[] args) {
        char ch = 'c';
        switch (ch) {
            case 'd': System.out.println("Veg Puff");
                    break;
            case 'a': System.out.println("Egg Puff"); // output : Egg Puff
                     break;
            case 'c': System.out.println("Paneer Puff");
                    break;
            default : System.out.println("We Wake up");
            
        }
    }
}

*/

// Program 3 : Calculator + , - , * , / and % using switch statement
import java.util.Scanner;
 public class CondStmt{
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = sc.nextInt();
        System.out.print("Enter b value : ");
        int b = sc.nextInt();
        System.out.println("\n--------------------------------------------------------------");
        System.out.print(" Enter any arthemetic operator (+ , - , * , / , %) here : ");
        char myoperator = sc.next().charAt(0); //Here sc.next() if for string which can take only words but we want the myoperator varible to store single character to do that we are adding .charAt(0) to the sc.next()
        System.out.println("====================================================================================");

        switch (myoperator) {
            case '+' : System.out.println("Addition of "+a+" + "+b+" = "+(a+b));
                       break;
            case '-' : System.out.println("Subtration of "+a+" - "+b+" = "+(a-b));
                       break;
            case '*' : System.out.println("Multiplication of "+a+" * "+b+" = "+(a*b));
                       break;
            case '/' : System.out.println("Division of "+a+" / "+b+" = "+(a/b));
                       break;
            case '%' : System.out.println("Reminder of "+a+" % "+b+" = "+(a%b));
                       break;
        
            default: System.out.println("Here Only Arthemetic Operators are allowed ");
                break;
        }
        sc.close(); // close the scanner to avoid resource leaks
    }
 }
