//Pattern1 : InvertedHalfTriangle pattern using method
/* InvertedHalfTriangle pattern :

					*
			    *	*
			*	* 	*
		*	* 	* 	*

*/

// To print the pattern using method
public class InvertedHalfTrianglePattern2_W_Method{
	public static void invertedHalfTri_W_Method(int n){
		//outer loop
		for(int i=1; i<=n; i++){
			//inner loop : space
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			//inner loop : stars
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
		}
			System.out.println();
	}

		public static void main(String args[]){
			invertedHalfTri_W_Method(5);
       	}
}