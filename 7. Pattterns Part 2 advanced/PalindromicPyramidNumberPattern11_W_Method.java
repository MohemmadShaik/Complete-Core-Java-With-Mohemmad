/* palidromic pyramid number pattern

            1
           212
          32123
         4321234
        543212345
*/	
class PalindromicPyramidNumberPattern11_W_Method{
	public static void palidromicPyr(int n){
		//outer loop
		for(int i=1; i<=n; i++){
			//inner loop : first space 
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			 //inner loop : second decending order
			 for(int j=i; j>=1; j--){
				 System.out.print(j);
			 }
			 
			 // inner loop : third ascending order
			 for(int j=2; j<=i; j++){
				 System.out.print(j);
			 }
			 System.out.println();
		}
	}
	
	public static void main(String[] args){
		palidromicPyr(5);
	}
}
