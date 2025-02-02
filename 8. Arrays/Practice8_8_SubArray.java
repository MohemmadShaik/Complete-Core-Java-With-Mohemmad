// Program: To print all the sub arrays of an array arr[] ={2,4,6,8,10} and also print the total number of sub arrays.
public class Practice8_8_SubArray {
    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            System.out.println();
            
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                
                subArraySum += sumSubArray(arr, i, j);
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
        int arr[] = {2, 4, 6, 8, 10};
        subArray(arr);
    }
}
