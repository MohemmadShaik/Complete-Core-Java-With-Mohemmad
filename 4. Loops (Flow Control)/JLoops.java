//1. While loop

//9.2program 1 : To print Hello World 100 times

/* public class JLoops {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<100) {
            System.out.println(counter+" : Hello World");
            counter++;
            
        }
        System.out.println("Hello World Printed 100 times completed.");
    }
} 
*/

//9.3Program 2 : To print numbers 1 to 10 using while loop

/* public class JLoops {

    public static void main(String[] args) {
        int count = 1;
        while(count <= 10){
            System.out.print(count+" ");
            count++;
        }
        System.out.println("\n Printed 1 to 10 numbers completed. ");
    }
} */

// 9.4Program 3 : To print numbers 1 to n, where n is the number given by the user end.\

/*
import java.util.Scanner;
 public class JLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= 1;
        System.out.print( " Enter n value : ");
        int n = sc.nextInt();

       while(count<=n){
        System.out.print(count+" ");
        count++;
       }
       System.out.println(" Numbers printed from 1 to n :"+n+" completed.");
       sc.close(); // close the scanner to avoid resource leaks
    }
}

*/

/* 
  //9.5 Program 4 : To print sum of first n natural numbers
  // Eg : let's say n = 5 then 1 + 2 + 3+ 4 + 5 = 15
 
 import java.util.Scanner;
 public class JLoops {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        
        while(i <= n){
             
             sum = sum + i;
             i++;   
        }
        System.out.println("Sum of first n :"+n+" Natural Numbers : "+sum);
        sc.close();// close the scanner to avoid resource leaks
    }
 }

 */

/*  
//9.6 for Loop

//Program 1:  to print 10 times Hello World using for loop.

public class JLoops{

   public static void main(String[] args) {
       for(int i=1; i<=10 ; i++){
           System.out.println(i+". Hello World");
       }
       System.out.println("Hello World Printed 10x");
   }
}
*/

//9.7 Print SQUARE Pattern
/* 
 public class JLoops{
    public static void main(String[] args) {
        for(int i = 1; i <= 4 ; i++){
            System.out.println("* * * *");
        }
    }
 }

 */

/* 
// 9.8 Print Reverse of a number
 // $$NOTE1 : To get the last digit of any number use : num%10
 // $$NOTE2 : To remove the last digit of any number use : num/10

import java.util.Scanner;;
 public class JLoops{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number a reverse : ");
       int num=sc.nextInt();
       int given_number = num;
       int reverse = 0;
       int last_digit = 0;
       while(num>0){
           last_digit = num%10;
           reverse = (reverse * 10) + last_digit;
           num = num/10;                                                                                                                                                                                                   
       }
       System.out.println("given Number : "+given_number+ "\n"+" Reverse Number : "+reverse);
      sc.close();//close the scanner to avoid resource leaks
   }
 }

 */

//9.11 Break Statement : To exit from loop we use break statement
/* 
// Program 9.11.1 : If i value is 3 then exit from the loop 
public class JLoops{
    public static void main(String[] args) {
        for (int i = 1; i<=10 ; i++){
            if(i==3){
                break; // to exit from this entire for loop
            }
            System.out.println(i);
        }
        System.out.println("Am out of the loop when i value is 3 ");
    }
}

*/

//9.12 Question - break keyword

// Program 9.12.1  : Keep entering numbers utill user enters a multiple of 10
//LOGIC 1 :
/* 
import java.util.Scanner;
public class JLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            
            System.out.print("Enter a number here : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
    */

/* 
//LOGIC 2 :
import java.util.Scanner;
 public class JLoops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any random number not multiply by 10 : ");
        int num = sc.nextInt();
        while(num>0){
            if(num%10==0){
                break;
            }
            System.out.println(num);
            // Ask for the next number
            System.out.print("Enter another number: ");
            num = sc.nextInt();
        }
        System.out.println("exit loop since "+num+" is multiply by 10.");
    }
 }
*/

/* 

 //Program 9.12.2 : print 1 to 10 numbers but from  number 7 I want numbers from 50 to 55 and then from 56 I want number continued from 7 to 10.

  //output : 1 2  3 4 5 6 50 51 52 53 54 55 7 8 9 10

 public class JLoops{
    public static void main(String[] args) {
        
        for( int i = 1; i<=10 ; i++ ){
            if(i==7){
                //System.out.print(" * ");
                break;
            }
            System.out.print(i+" ");
        }
        for ( int i = 50; i <= 60; i++ ){
            if(i==56){
                //System.out.print(" * ");
                break;
            }
            System.out.print(i+" ");
        }
        for( int i = 7; i<=10 ; i++){
            System.out.print(i+" ");
        }
        //System.out.print(" * ");
    }
 }

*/

// 9.13 Continue statement : to skip an iteration

// Program 9.13.1 : Print 1 to 5 numbers such that 3 value should be skippped
/*  
public class JLoops{
    public static void main(String[] args) {
        for(int i = 1; i<=5 ; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}

*/

// 9.14 Question - continue keyword

// Program 9.14 : Display all numbers entered by user except multiple of 10
// Note : Here the program is in infinite loop because 1. while loop  never get false and
// 2. we used continue statement which tend to skip a particular value based on the condition applied on it but it won't stop.
// 3. To exit from infinite loop press  ctrl + c 
/* 
import java.util.Scanner;
public class JLoops {

     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("Enter a number : ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println(num);

        }while(true);

        //sc.close(); // to close the scanner to avoid resource leaks

     }
}
*/

// 9.15 Check if a number is Prime or not
/* 
import java.util.Scanner;

public class JLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number ");
        int n = sc.nextInt();
        // Handle the edge cases for n <= 1
        if (n <= 1) {
            System.out.println(n + " is not a Prime Number.");
        } else {
            boolean isPrime = true;
             // Only check up to the square root of n
            for (int i = 2; i <=Math.sqrt(n); i++) { //for (int i=2; i<=n-1; i++) it also works fine but it's not that optimized compared to math.sqrt(n) because here loop checks for n-2 times for any given number.
                if (n % i == 0) { // n is a multiple of i ( i is not equal to 1 or n)
                    isPrime = false;
                    break;  // No need to check further, not a prime number
                }
            }
            if (isPrime == true) {
                System.out.println(n + " is a Prime Number.");
            } else {
                System.out.println(n + " is not a Prime Number. ");
            }
        }
        sc.close(); // close the scanner to avoid resource leaks
    }
}

*/


// 9.15.1 To print prime numbers from 2 to n without using function , where n is the number given by the user. Let's say n = 15 then output : 2 3 5 7 11 13

/* import java.util.Scanner;

public class PrimeNumbersWithoutFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 2 to " + n + " are:");

        // Loop through each number from 2 to n
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            // Check if the number i is prime
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // No need to check further if it's divisible
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
*/

//9.15.2 To print prime numbers from 2 to n  by using function , where n is the number given by the user. Let's say n = 15 then output : 2 3 5 7 11 13

/* import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.println("Prime numbers from 2 to " + n + " are:");

        // Loop through each number from 2 to n
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

*/

//9.15.3 Print prime numbers from 2 to n lets say n = 15 then output should be :
 /* Prime numbers from 2 to 15 are :  2 , 3 , 5 , 7 , 11 , 13. */

 /* import java.util.Scanner;

 public class JLoops {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the n value : ");
         int num = s.nextInt();
         int given_num = num;
         System.out.print("Prime numbers from 2 to "+given_num+" are : \n");
         boolean first = true; // To control comma placement
         //int primeCount = 0; // To count the number of primes found
         for(int i = 2; i <= num ; i++){
             boolean isPrime = true;
             for (int j = 2; j <= Math.sqrt(i) ; j++){
                 if(i%j == 0){
                     isPrime = false;
                     break;
                 }
             }
             if(isPrime == true){
                //primeCount++;
                 if (!first) {
                     System.out.print(" , ");
                 }
                 System.out.print(i);
                 first = false; // After the first prime is printed, set first to false
             }
         }
 
         // // Print a period if any primes were found
         // if (primeCount > 0) {
         //     System.out.print("."); // Add a period after the last prime
         // }
         System.out.print("."); // To move to the next line after output
         s.close(); //Close the scanner to avoid resource leaks.
     }
 }
 
 */

