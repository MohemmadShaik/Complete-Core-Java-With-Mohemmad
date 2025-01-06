// Create a half pyramid pattern of numbers as shown below:
/* 
          1 2 3 4 5
          1 2 3 4
          1 2 3
          1 2
          1

  */

//Pattern 4 without using method
import java.util.Scanner;
class HalfPyramidPatternNumbers1_WO_Method{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = scanner.nextInt();
        System.out.println("-------------------------");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
             System.out.print("\n");
        }
        scanner.close();
    }
}