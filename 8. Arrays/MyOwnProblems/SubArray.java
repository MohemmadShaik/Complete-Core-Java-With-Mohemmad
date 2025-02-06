package MyOwnProblems;

class SubArray {
    public static void printSubArray(int arr[]) {
        int totalSubArray = 0;
        int subArraySum = 0; // Initialize sum for each starting element
        // start
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            // end
            for (int j = i; j < arr.length; j++) {
                subArraySum += arr[j];
                // print subarray 
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println("\nTotal sum_subarray arr[" + arr[i] + "] : " + subArraySum);
            System.out.println("------------------------------");
        }
        System.out.println("Total subarray is : " + totalSubArray);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }
}