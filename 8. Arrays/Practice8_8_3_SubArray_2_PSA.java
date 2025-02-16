/* 
Pracice 9.2.3 : Prefix Sum Approach to Sum All Subarrays :
                -----------------------------------------
Instead of recalculating the sum for each subarray from scratch, we can use Prefix Sum to optimize the process.

Q) What is the Prefix Sum Approach?
   We precompute a prefix sum array (prefix[]) where prefix[i] stores the sum 
   of all elements from index 0 to i.
   Using this prefix sum, we can compute any subarray sum efficiently in O(1)
   time instead of recalculating in O(n) time.

Q) What is the Prefix Sum array?
   The Prefix Sum array is an array where prefix[i] stores the sum of all elements
   from index 0 to i in the original array.

Q) What is the Formula to Compute a Subarray Sum using Prefix Sum?

        For a subarray from index i to j:
        
        Sum = prefix[j] − prefix[i−1]
        
        If i = 0, then:
        
        Sum = prefix[j]

Q) Explanation of Optimized Approach using Prefix Sum:
   1. Calculate the Prefix Sum array for the given array.
   2. Iterate through all subarrays from index i to j.
   3. Calculate the sum of the subarray using the Prefix Sum array.
   4. Update the maximum sum of all subarrays.


 Q) How to calculate the Prefix Sum array?
   1. Initialize prefix[0] = arr[0]
   2. Iterate from i = 1 to n-1
      prefix[i] = prefix[i-1] + arr[i]

Q) How to calculate the sum of a subarray from index 'start' to 'end' using Prefix Sum?
   sum = prefix[end] - prefix[start-1] if start > 0
   sum = prefix[end] if start = 0

Q) What is the time complexity of the Prefix Sum Approach?
    1. Time complexity to calculate the Prefix Sum array is O(n)
    2. Time complexity to calculate the sum of a subarray using Prefix Sum is O(1)
    3. Overall time complexity to calculate the sum of all subarrays is O(n) + O(1) = O(n)

Q) What is the space complexity of the Prefix Sum Approach?
    Space complexity is O(n) to store the Prefix Sum array.

Q) What is the advantage of the Prefix Sum Approach?
    1. It is more efficient than recalculating the sum for each subarray from scratch.
    2. It reduces the time complexity from O(n^2) to O(n).
    3. It is useful when we need to calculate the sum of all subarrays.

Q) What is the disadvantage of the Prefix Sum Approach?
    1. It requires extra space to store the Prefix Sum array.
    2. It is not useful when we need to calculate the sum of a single subarray.

Q) When to use the Prefix Sum Approach?
    1. When we need to calculate the sum of all subarrays.
    2. When we need to calculate the sum of multiple subarrays.
    3. When we need to calculate the sum of subarrays efficiently.

Q) When not to use the Prefix Sum Approach?
    1. When we need to calculate the sum of a single subarray.
    2. When we have memory constraints to store the Prefix Sum array.
    3. When we need to calculate the sum of subarrays in-place.

-----------------------------------------------------------------------------------
*/

public class Practice8_8_3_SubArray_2_PSA{
	public static void prefixSumSubArr(int arr[]){
		int currSum =0;
		int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
		//compute the prefix sum array
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];
		for(int i=1; i<prefix.length; i++){
			prefix[i] = prefix[i-1]+arr[i];
		}
		//start
		for(int i=0; i<arr.length; i++){
            int start = i;
			//end
			for(int j=i; j<arr.length; j++){
                int end = j;
                //calculate the sum of subarray using prefix sum
				currSum = (start==0)? prefix[end] : (prefix[end] - prefix[start-1]);
                //print subArray
			 // System.out.println(currSum);
             //max and min sum of sub array
			  if(currSum>maxSum){
				  maxSum = currSum;
			  }
                if(currSum<minSum){
                    minSum = currSum;
			    }
		}
    }
        System.out.println("-----------------------------");
		System.out.println("Max Sum is : "+maxSum+"\n");
        System.out.println("Min Sum is : "+minSum+"\n");

	}
	public static void main(String[] args){
		int arr[] = {1,2,3,4};
		prefixSumSubArr(arr);
	}
}