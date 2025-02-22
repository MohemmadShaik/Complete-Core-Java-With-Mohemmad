//Practice 9.2.1 : Find Max SubArray sum using three for loops , O(n^3) time complexity.
// STEP1 : Brute Force approach :   this is very normal approach to find the max sub array sum. 
// STEP 2 : Prefix sum approach :  this is the best compare to Brute Force approach to find the max sub array sum.
// STEP 3 : Kadane's Algorithm :  this is the top most best approach compare to Prefix , Brute Force approach to find the max sub array sum.
/* - - - - - - - - - - -- - - - - - - - - - -- - - - - - - - -- - - - - -- - - - - - - -- - - - - - - - -- - - - - - - - - - - - -- - - - - - - */
//STEP1 : Brute Force Approach(BFA) using three for loops , O(n^3) time complexity.
public class Practice8_8_3_SubArray_1_BFA {
	public static void maxSumSubArray(int arr[]) {
		int max_sum = Integer.MIN_VALUE;
		int min_sum = Integer.MAX_VALUE;
		int curr_Sum = 0;

		System.out.println("\n ");

		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {
				curr_Sum = 0;

				for (int k = i; k <= j; k++) {
					curr_Sum += arr[k];
				}

				System.out.println(curr_Sum);

				if (curr_Sum > max_sum) {
					max_sum = curr_Sum;
				}
				if (curr_Sum < min_sum) {
					min_sum = curr_Sum;
				}
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Max sum is : " + max_sum);
		System.out.println("Min sum is : " + min_sum);
	}

	public static void main(String[] args) {
		int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
		maxSumSubArray(arr);
	}
}

// Practice 9.2.2 : Find Max SubArray sum using two for loops.
// STEP1 : Brute Force approach : this is very normal approach to find the max
// sub array sum.
// STEP 2 : Prefix sum approach : this is the best compare to Brute Force
// approach to find the max sub array sum.
// STEP 3 : Kadane's Algorithm : this is the top most best approach compare to
// Prefix , Brute Force approach to find the max sub array sum.
/*
 * - - - - - - - - - - -- - - - - - - - - - -- - - - - - - - -- - - - - -- - - -
 * - - - -- - - - - - - - -- - - - - - - - - - - - -- - - - - - -
 */

// STEP1 : Brute Force approach using two for loops , O(n^2) time complexity.

/*
 * public class Practice8_8_3_SubArray{
 * public static void maxSumSubArray(int arr[]){
 * int max_sum = Integer.MIN_VALUE;
 * int min_sum = Integer.MAX_VALUE;
 * for(int i=0; i<arr.length; i++){
 * int eachSubArrSum = 0;
 * for(int j=i; j<arr.length; j++){
 * eachSubArrSum += arr[j];
 * System.out.println(eachSubArrSum);
 * 
 * if(eachSubArrSum > max_sum){
 * max_sum = eachSubArrSum;
 * }
 * if(eachSubArrSum < min_sum){
 * min_sum = eachSubArrSum;
 * }
 * }
 * }
 * System.out.println("-----------------------------");
 * System.out.println("Max sum is : "+max_sum);
 * System.out.println("Min sum is : "+min_sum);
 * }
 * public static void main(String[] args){
 * int arr[] = {1,-2,6,-1,3};
 * maxSumSubArray(arr);
 * 
 * }
 * }
 */