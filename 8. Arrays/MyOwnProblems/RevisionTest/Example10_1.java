//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_1 : Print in reverse order for the sorted array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_2 : Print in reverse order for the un-sorted array arr[] ={2,4,3,1,0,6,5} using linear search.
//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 10 : To print (a) all the sub arrays, (b)total sub arrays count, (c)sum of all sub arrays and (d)total sum of all sub arrays of an arr[] ={10,20,30,40,50}.
//Example 10_1 : Example 10 each part separately discussed for better understanding.
/* ===================================================================================================================================================================== */	

/*Example10 PART A , PART B , PART C and PART D are individually dicussed in this Example10_1 file.*/

package MyOwnProblems.RevisionTest;

//PART-A : To print the sub arrays of an arr[] = {10,20,30,40,50}.

/*
class Example10_1{
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
class Example10_1{
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
/* 
class Example10_1{
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
*/

//---------------><--------------------PART-C END---------------><--------------------

//PART-D : To print the total sum of all sub arrays in an arr[] ={10,20,30,40,50}.


class Example10_1{
	public static void example10_2_Method(int myarr[]){
        int count_All_subArray = 0; //PART-B : To count the total number of sub arrays.
        int tot_Sum_All_SubArr = 0; //PART-D : To print the total of each sub array sum.
		for(int i=0; i<myarr.length; i++){
            int subArrSum = 0; //PART-C
            int tot_All_SubArrSum = 0; //PART-C
			//end
			for(int j=i; j<myarr.length; j++){
                subArrSum += myarr[j]; //PART-C
                tot_All_SubArrSum += subArrSum; //PART-C
                tot_Sum_All_SubArr += subArrSum; //PART-D
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
        System.out.println("Total of all sub arrays sum is : "+tot_Sum_All_SubArr); //PART-D : To print the total of each sub array sum (i.e 350+300+220+130+50 = 1050).
        System.out.println("\n---------------------------------------------\n");
	}
	public static void main(String[] args){
		int myarr[] ={10,20,30,40,50};
        System.out.println("\nPART-A : To print the sub arrays of an arr[] ={10,20,30,40,50}.\n");
		example10_2_Method(myarr);
	}
}

//---------------><--------------------PART-D END---------------><--------------------