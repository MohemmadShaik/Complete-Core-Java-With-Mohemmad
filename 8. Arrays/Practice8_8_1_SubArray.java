/*  Practice9.1 : (PART-E) --> To print sum of each sub array and find the maximum and minimum sum of sub arrays for the given array arr[] ={10,20,30,40,50}.

                            output :
                            ----------------< PART-E START >--------------------

                           10              ---> 10             
                           10 20           ---> 30            
                           10 20 30        ---> 60        
                           10 20 30 40     ---> 100      
                           10 20 30 40 50  ---> 150
                           20              ---> 20            
                           20 30           ---> 50     
                           20 30 40        ---> 90
                           20 30 40 50     ---> 140
                           30              ---> 30
                           30 40           ---> 70
                           30 40 50        ---> 120       
                           40              ---> 40            
                           40 50           ---> 90         
                           50              ---> 50

                           Maximum sum of sub array is : 150
                           Minimum sum of sub array is : 10
    
                         ----------------< PART-E END >--------------------
*/

public class Practice8_8_1_SubArray {
	public static void subArray(int arr[]){
        int max_sum = Integer.MIN_VALUE; // PART-E max sum of sub array
        int min_sum = Integer.MAX_VALUE; // PART-E min sum of sub array
		//start
		for(int i=0; i<arr.length; i++){
            int sum_Each_subarray = 0; // PART-E sum of each sub array
			//end
			for(int j=i; j<arr.length; j++){
                sum_Each_subarray += arr[j]; // PART-E
				//print subArray
				for(int k=i; k<=j; k++){
					System.out.print(arr[k]+" ");
				}
                System.out.println(" ---> "+sum_Each_subarray); // PART-E

                if(sum_Each_subarray > max_sum){ 
                    max_sum = sum_Each_subarray; 
                }
                if(sum_Each_subarray < min_sum){ 
                    min_sum = sum_Each_subarray;
                }
			}
			
			System.out.println();
            
		}
        System.out.println("Maximum sum of sub array is : "+max_sum); // PART-E max sum of sub array
        System.out.println("Minimum sum of sub array is : "+min_sum); // PART-E min sum of sub array
	}
    public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
        System.out.println("\nPART-E : To print sum of each sub array for an array arr[] ={10,20,30,40,50}.\n");
		subArray(arr);
	}
}
