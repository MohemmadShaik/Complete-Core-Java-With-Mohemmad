//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={10,30,5,50,20,80,5}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 10 : To print (a) all the sub arrays, (b)total sub arrays count, (c)sum of all sub arrays and (d)total sum of all sub arrays of an arr[] ={10,20,30,40,50}.
/* =================================================================================================================================================================== */

// KEY NOTE : Example10_1 is also gives same output as Example10 but I didn't mentioned any comments of PART-A , B, C and D in Example101 file that's the only difference between these two files.

/* Example 10 : (PART-A) To print all the sub arrays of an arr[] ={10,20,30,40,50}. 
                 
                 (PART-A) output : 
                 ----------------< PART-A START >--------------------

                    10                 // 1st sub array
                    10 20              // 2nd sub array
                    10 20 30          // 3rd sub array
                    10 20 30 40       // 4th sub array
                    10 20 30 40 50    // 5th sub array
                    
                    20                // 6th sub array
                    20 30             // 7th sub array
                    20 30 40          // 8th sub array
                    20 30 40 50       // 9th sub array
                    
                    30               // 10th sub array
                    30 40            // 11th sub array
                    30 40 50         // 12th sub array
                    
                    40               // 13th sub array
                    40 50            // 14th sub array
                    
                    50               // 15th sub array

                    ----------------< PART-A END >--------------------
                
                 
                 
                     (PART-B) Now print the no.of sub arrays count of an arr[] ={10,20,30,40,50}.
                    
                     (PART-B) output :
                             ----------------< PART-B START >--------------------
                             Total subArray count is : 15

                            ----------------< PART-B END >--------------------
                
                    
                    
                    (PART-C) To print the sum of all the sub arrays in an arr[] ={10,20,30,40,50} and 
                    
                     (PART-C) output : 
                    ----------------< PART-C START >--------------------
                    
                           10                 
                           10 20              
                           10 20 30          
                           10 20 30 40       
                           10 20 30 40 50

                            Total sub array sum : [10] is : 350
                    
                            20                
                            20 30             
                            20 30 40          
                            20 30 40 50

                            Total sub array sum : [20] is : 300
                    
                            30               
                            30 40            
                            30 40 50         

                            Total sub array sum : [30] is : 220
                    
                            40               
                            40 50            

                            Total sub array sum : [40] is : 130
                    
                            50

                            Total sub array sum : [50] is : 50

                            ----------------< PART-C END >--------------------
                             
                           
                           
                            (PART-D) also print the total sum of all sub arrays.

                            (PART-D) output :
                            ----------------< PART-D START >--------------------
                           
                               Total subArray sum is : 1050

                            ----------------< PART-D END >--------------------
                        
*/

package MyOwnProblems.RevisionTest;

public class Example10 {
    public static void arymethod(int ary[]){
		int tot_Sum_All_SubArr = 0; // Total sum of all sub arrays -- PART-D
        int tot_Count_SubArr = 0; // Total count of subarrays -- PART-B
        System.out.println();
		for(int i=0; i<ary.length; i++){
            int subArrSum = 0; //PART-C
            int tot_SubArrSum = 0; // sum of subarrays total -- PART-C
			for(int j=i; j<ary.length; j++){
                subArrSum += ary[j]; // PART-C
                tot_SubArrSum += subArrSum; // PART-C
                tot_Sum_All_SubArr += subArrSum; // PART-D
				for(int k=i; k<=j; k++){
					System.out.print(ary[k]+" "); // PART-A	
			}
			System.out.println();
			tot_Count_SubArr++; // PART-B
		}
        System.out.println("- - - - - - - - - - - - - - - -  - - - -  -");
        System.out.println("Sub array sum : "+"["+ary[i]+"] is : "+tot_SubArrSum+"\n"); // PART-C
	}
    System.out.println("\n------------------------------------\n");
    System.out.println("Total subArray count is : "+tot_Count_SubArr+"\n"); // PART-B
    System.out.println("Total subArray sum is : "+tot_Sum_All_SubArr+"\n"); // PART-D
    System.out.println("\n------------------------------------");
}

    public static void main(String[] args) {
        int ary[] = { 10, 20, 30, 40, 50 };
        arymethod(ary);

    }

}

