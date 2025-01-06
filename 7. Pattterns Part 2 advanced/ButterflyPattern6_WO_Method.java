// Pattern6 : Butterfly pattern WithOut using method 

/* 

        *      * 
		**    **
		***  *** 
		********
		********
		***  ***
		**    **
		*      *
		

*/

import java.util.Scanner;

class ButterflyPattern6_WO_Method{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = scanner.nextInt();
		System.out.println("*===*====><=====><=======><====*===*");
		//1st half : Outer loop
		for(int i=1 ; i<=n; i++){
			//inner loop 
			//Step1 : Print stars --> i value
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//Step2 : Print spaces
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			//Step3 : Print stars --> i value
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
            //First half of the pattern Ends here
		}
		
		//2nd half : Outer loop
		for(int i=n ; i>=1; i--){
			//inner loop 
			//Step1 : Print stars --> i value
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			//Step2 : Print spaces
			for(int j=1; j<=2*(n-i); j++){
				System.out.print(" ");
			}
			//Step3 : Print stars --> i value
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
            //Second half of the pattern Ends here
		}
		scanner.close();
	}
}