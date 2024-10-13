//Prime numbers range from 2 to n 
/* Note : here first we defined the isprime() logic using function and
 the same logic we used in another function called primeRange() */

 import java.util.Scanner;
 public class Func_MyPrimeRangeXxx {
 
    public static boolean isPrime(int n){
     for(int i=2; i<=Math.sqrt(n); i++){
         if(n%i==0){
             return false;
         }
     }
     return true;
    }
 
     public static void primeRange(int n){
         for(int i = 2; i<=n; i++){
             if(isPrime(i)){
                 System.out.print(i+" ");
             }
         }
         System.out.println();
     }
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.print("Enter n value : ");
         int n = s.nextInt();
         primeRange(n);
     }
     
 }
 