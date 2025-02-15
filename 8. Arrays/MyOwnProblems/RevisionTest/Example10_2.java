/*Example10 PART A , PART B , PART C and PART D are individually dicussed in the code snippet.*/

package MyOwnProblems.RevisionTest;

//PART-A : To print the sub arrays of an arr[] = {10,20,30,40,50}.
class Example10_2{
	public static void example10_2_Method(int myarr[]){
		//start
		for(int i=0; i<myarr.length; i++){
			//end
			for(int j=i; j<myarr.length; j++){
				//print subarray
				for(int k=i; k<=j; k++){
					System.out.print(myarr[k]+" ");
				}
                System.out.println();
                
			}
            System.out.println("- - - - - - - -");
            System.out.println();
		}
	}
	public static void main(String[] args){
		int myarr[] ={10,20,30,40,50};
        System.out.println("\nPART-A : To print the sub arrays of an arr[] ={10,20,30,40,50}.\n");
		example10_2_Method(myarr);
	}
}



