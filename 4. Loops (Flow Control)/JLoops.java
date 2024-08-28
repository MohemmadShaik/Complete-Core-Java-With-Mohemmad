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

 //9.6 for Loop


