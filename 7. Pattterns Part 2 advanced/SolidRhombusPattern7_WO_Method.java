//Pattern7 : Solid Rhombus WithOut using method

/* 
             *****
            *****
           *****
          *****
         *****

*/
import java.util.Scanner;
class SolidRhombusPattern7_WO_Method{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value : ");
		int n = scanner.nextInt();
		System.out.println("======================\n");
		//outer loop
		for(int i=1; i<=n; i++){
			//1st inner loop for spaces
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			//2nd inner loop for stars
			for(int j=1; j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
