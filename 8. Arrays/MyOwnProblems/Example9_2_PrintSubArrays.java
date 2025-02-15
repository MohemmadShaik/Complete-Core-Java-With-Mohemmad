package MyOwnProblems;


/* Example9_2_PrintSubArrays : (PART-A) To print all the sub arrays of an arr[] ={10,20,30,40,50}. 
                               (PART-B) Now print the no.of sub arrays count of an arr[] ={10,20,30,40,50}.
                               (PART-C) To print the sum of all the sub arrays in an arr[] ={10,20,30,40,50}.
                               (PART-D) also print the total sum of all sub arrays.
   
   Best Example for sub arrays and best practice for sub arrays without using helper method.

// KEY NOTE : In Example10_1 we have discussed each part of the problem statement separately for better understanding.

                 
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

public class Example9_2_PrintSubArrays {
    public static void arymethod(int ary[]) {
        int tot_Sum_All_SubArr = 0; // Total sum of all sub arrays -- PART-D
        int tot_Count_SubArr = 0; // Total count of subarrays -- PART-B
        System.out.println();
        for (int i = 0; i < ary.length; i++) {
            int subArrSum = 0; // PART-C
            int tot_SubArrSum = 0; // sum of subarrays total -- PART-C
            for (int j = i; j < ary.length; j++) {
                subArrSum += ary[j]; // PART-C
                tot_SubArrSum += subArrSum; // PART-C
                tot_Sum_All_SubArr += subArrSum; // PART-D
                for (int k = i; k <= j; k++) {
                    System.out.print(ary[k] + " "); // PART-A
                }
                System.out.println();
                tot_Count_SubArr++; // PART-B
            }
            System.out.println("- - - - - - - - - - - - - - - -  - - - -  -");
            System.out.println("Sub array sum : " + "[" + ary[i] + "] is : " + tot_SubArrSum + "\n"); // PART-C
        }
        System.out.println("\n------------------------------------\n");
        System.out.println("Total subArray count is : " + tot_Count_SubArr + "\n"); // PART-B
        System.out.println("Total subArray sum is : " + tot_Sum_All_SubArr + "\n"); // PART-D
        System.out.println("\n------------------------------------");
    }

    public static void main(String[] args) {
        int ary[] = { 10, 20, 30, 40, 50 };
        arymethod(ary);

    }

}
