/*Example10 PART A , PART B , PART C and PART D are individually dicussed in the code snippet.*/

package MyOwnProblems.RevisionTest;

//PART-A : To print the sub arrays of an arr[] = {10,20,30,40,50}.

/*
class Example10_2{
	public static void example10_2_Method(int myarr[]){
		//start
		for(int i=0; i<myarr.length; i++){
			//end
			for(int j=i; j<myarr.length; j++){
				//print subarray
				for(int k=i; k<=j; k++){
					System.out.print(myarr[k]+" "); // PART-A
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

*/

//-------------><------------------->PART-A END<-------------------><---------------------

//PART-B : Now print the no.of sub arrays count of an arr[] ={10,20,30,40,50}.
/*
class Example10_2{
	public static void example10_2_Method(int myarr[]){
        int count_All_subArray = 0; //PART-B
		//start
		for(int i=0; i<myarr.length; i++){
			//end
			for(int j=i; j<myarr.length; j++){
				//print subarray
				for(int k=i; k<=j; k++){
					System.out.print(myarr[k]+" ");
				}
                count_All_subArray++;
                System.out.println();
                
			}
            System.out.println("- - - - - - - -\n");
		}
        System.out.println("\n-------------------PART-B COUNT--------------------------\n");
        System.out.println("Total number of sub arrays count is : "+count_All_subArray);
        System.out.println("\n---------------------------------------------\n");
	}
	public static void main(String[] args){
		int myarr[] ={10,20,30,40,50};
        System.out.println("\nPART-A : To print the sub arrays of an arr[] ={10,20,30,40,50}.\n");
		example10_2_Method(myarr);
	}
}
*/

//---------------><--------------------PART-B END---------------><--------------------

//PART-C : To print the sum of all the sub arrays in an arr[] ={10,20,30,40,50}.

class Example10_2{
	public static void example10_2_Method(int myarr[]){
        int count_All_subArray = 0;
		//start
		for(int i=0; i<myarr.length; i++){
            int subArrSum = 0; //PART-C
            int tot_All_SubArrSum = 0; //PART-C
			//end
			for(int j=i; j<myarr.length; j++){
                subArrSum += myarr[j]; //PART-C
                tot_All_SubArrSum += subArrSum; //PART-C
				//print subarray
				for(int k=i; k<=j; k++){
					System.out.print(myarr[k]+" ");
				}

                System.out.print("--->"+subArrSum); //PART-C : To print sum of each sub arrays.

                count_All_subArray++;
                System.out.println();
                
			}
            System.out.println("- - - - - - - - - - - - - - - - - - -");
            System.out.println("Sub array sum : "+"["+myarr[i]+"] is : "+tot_All_SubArrSum+"\n"); //PART-C To print sum of all sub arrays starting from ary[i].
		}
        System.out.println("\n-------------------PART-B COUNT--------------\n");
        System.out.println("Total number of sub arrays count is : "+count_All_subArray);
        System.out.println("\n---------------------------------------------\n");
	}
	public static void main(String[] args){
		int myarr[] ={10,20,30,40,50};
        System.out.println("\nPART-A : To print the sub arrays of an arr[] ={10,20,30,40,50}.\n");
		example10_2_Method(myarr);
	}
}



