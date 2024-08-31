// 9.16 Loops Questions FAQ's - Practice Questions(PQ)

// Q1 : How many times 'Hello' is printed?

/* 
public class JLoopsPQ1 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("Hello"); //output : 2 times Hello will be printed
            i+=2; //i = i+2; 
        }
    }
}

*/

/* 
//  To check given number by the user is Prime or not 
import java.util.Scanner;

public class JLoopsPQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();

        if(n==1){
            System.out.println(n+" is not a prime number.");
        }else{
            boolean isPrime=true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime=false; // n is multiple of i ( i is not equal to 1 and n)
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(n+" is a prime number.");
            }else{
                System.out.println(n+" is not a prime number.");
            }

        }  
        sc.close();//close the scanner to avoid resource leaks 
        
    }
}

*/

// print reverse of a given number by the user
// **Note : number%10 = get the last digit , number/10 = remove last digit from the number
// **Note :1. last_digit = n%10 , 2. reverse = (reverse * 10) + last_digit , 3. n = n/10 

import java.util.Scanner;

public class JLoopsPQ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = sc.nextInt();
        int givenNumber = n;
        int lastDigit=0;
        int rev = 0;

        while(n>0){
            
           lastDigit = n%10;
           rev = (rev * 10) + lastDigit;
           n /= 10; // n = n/10;
        }
        System.out.println(givenNumber+" Reverse is : "+rev);
        sc.close(); // close the scanner to avoid resource leaks
    }
}

