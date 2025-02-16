/* Kadane's Algorithm – Maximum Subarray Sum
   -----------------------------------------
   - Kadane’s Algorithm is used to find the maximum sum of a contiguous subarray in an array efficiently in O(n) time complexity.
    
   - The algorithm works by iterating through the array and keeping track of the maximum sum of subarrays ending at each index.
  
Kadane’s Algorithm Explanation
==============================
The algorithm maintains two variables:

maxSum → Stores the maximum sum found so far.
currSum → Stores the sum of the current subarray.

The algorithm works as follows :
--------------------------------

1. Initialize:
   ----------
- maxSum = Integer.MIN_VALUE (to track the maximum sum found so far).
- currSum = 0 (to store the sum of the current subarray).

2. Loop Through the Array Elements:
   -------------------------------
- Add the current element to currSum.
- If currSum becomes greater than maxSum, update maxSum.
- If currSum becomes negative, reset it to 0 (since a negative sum is useless).
- Repeat the process for all elements in the array.

3. Return maxSum as the result.
 
 */

 public class Practice8_8_3_SubArray_3_KAA {
	public static void kadanesAlgoMaxSum(int arr[]){
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			currentSum += arr[i];
			if(currentSum < 0){
				currentSum = 0;
			}
			
			maxSum = Math.max(currentSum, maxSum);
				
		}
		System.out.println("\nOur maximum sum is : "+maxSum+"\n");
	}
	public static void main(String[] args){
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        //int arr[] = {2,-3,4,-1,-5,3};
        //int arr[] = {1,2,3,4};
		kadanesAlgoMaxSum(arr);
	}
    
}