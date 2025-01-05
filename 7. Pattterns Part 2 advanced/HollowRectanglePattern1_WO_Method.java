//Hollow Rectangle Pattern with user input rows and columns WithOut using the method.

import java.util.Scanner;

class HollowRectanglePattern1_WO_Method{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter tot rows : ");
		int totrow = s.nextInt();
		System.out.print("Enter tot columns : ");
		int totcol = s.nextInt();
		//outer loop: rows
		for(int i=1; i<=totrow; i++){
			//inner loop: columns
			for(int j=1; j<=totcol; j++){
				//boundery cells
				if(i==1 || i==totrow || j==1 || j==totcol){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			 System.out.print("\n");
		}
        s.close(); // close the scanner
	}
}