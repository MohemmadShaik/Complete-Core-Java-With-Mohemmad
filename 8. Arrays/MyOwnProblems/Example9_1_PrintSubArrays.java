package MyOwnProblems;

// Example9_1 : USING HELPER METHOD is not the best practice to calculate the sum of subarrays.
// because the time complexity is O(n^4) , Since we have 4 for loops which is not efficient.


public class Example9_1_PrintSubArrays {
    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            System.out.println();
            
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                
                subArraySum += sumSubArray(arr, i, j); //helper method to calculate sum of subarray from index 'i' to 'j'
                System.out.println();
            }
            
            System.out.println("\nTotal sum_subarray arr[" + arr[i] + "] : " + subArraySum);
        }
    }

    // Helper method to calculate sum of a subarray from index 'start' to 'end'
    private static int sumSubArray(int arr[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        subArray(arr);
    }
}
