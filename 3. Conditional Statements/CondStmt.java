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



// Program5.2 : Applying different logic for the same program 5.1 .                            

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
 

