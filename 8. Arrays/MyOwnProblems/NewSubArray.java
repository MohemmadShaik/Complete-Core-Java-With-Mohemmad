package MyOwnProblems;
//Part1 : printing subarrays and total subarrays count
/* public class NewSubArray {
    public static void subArrayMethod(int my_arr[]) {
        System.out.println();
        int totalSubArray = 0;
        // start
        for (int i = 0; i < my_arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            // end
            for (int j = i; j < my_arr.length; j++) {
                subArraySum += my_arr[j]; // Maintain running sum instead of recalculating
                // print subarrays
                for (int k = i; k <= j; k++) {
                    System.out.print(my_arr[k] + " ");
                }
                totalSubArray++;
                
                System.out.print("\n");
            }
              System.out.println("-----^^^--------^^^----------^^^-------");
              System.out.println("\nTotal sum_subarray arr[" + my_arr[i] + "] : " + subArraySum+"\n");
              System.out.println("-----------^^^----------^^^---------");
              System.out.print("\n");
        }
        System.out.println("\nTotal subarray is : " + totalSubArray+"\n");
    }

    public static void main(String[] args) {
        int my_arr[] = { 10, 20, 30, 40, 50 };
        subArrayMethod(my_arr);
    }
}
 */

 //Part2 :( NEED TO RECHEK AND CONFIRM THE OUTPUT) printing subarrays, total subarrays count and total sum of subarrays
 /* public class NewSubArray {
    public static void subArrayMethod(int my_arr[]) {
        System.out.println();
        int totalSubArray = 0;
        
        // Start index of subarray
        for (int i = 0; i < my_arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            
            // End index of subarray
            for (int j = i; j < my_arr.length; j++) {
                subArraySum += my_arr[j]; // Maintain sum for subarrays
                
                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(my_arr[k] + " ");
                }
                System.out.print("\n");
                totalSubArray++;
            }
            
            System.out.println("-----^^^--------^^^----------^^^-------");
            System.out.println("\nTotal sum_subarray arr[" + my_arr[i] + "] : " + subArraySum + "\n");
            System.out.println("-----------^^^----------^^^---------");
            System.out.print("\n");
        }
        System.out.println("\nTotal subarray is : " + totalSubArray + "\n");
    }

    public static void main(String[] args) {
        int my_arr[] = { 10, 20, 30, 40, 50 };
        subArrayMethod(my_arr);
    }
}
 */

 //Part3 : (NEED TO RECHECK AND CONFIRM THE OUTPUT) printing subarrays, total subarrays count, total sum of subarrays and corrected sum of subarrays.
 //OUTPUT IS TOTALLY LARGE NUMBERS WHICH IS A BLUDER MISTAKE  NEED TO EXAMINE WHY IT HAPPENED SO.
/*  public class NewSubArray {
    public static void subArrayMethod(int my_arr[]) {
        System.out.println();
        int totalSubArray = 0;
        
        // Start index of subarray
        for (int i = 0; i < my_arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            
            // End index of subarray
            for (int j = i; j < my_arr.length; j++) {
                subArraySum += my_arr[j]; // Maintain sum for subarrays
                
                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(my_arr[k] + " ");
                }
                System.out.print("\n");
                totalSubArray++;
            }
            
            int correctedSum = 0;
            for (int m = i; m < my_arr.length; m++) {
                for (int n = m; n < my_arr.length; n++) {
                    for (int p = m; p <= n; p++) {
                        correctedSum += my_arr[p];
                    }
                }
            }
            
            System.out.println("-----^^^--------^^^----------^^^-------");
            System.out.println("\nTotal sum_subarray arr[" + my_arr[i] + "] : " + correctedSum + "\n");
            System.out.println("-----------^^^----------^^^---------");
            System.out.print("\n");
        }
        System.out.println("\nTotal subarray is : " + totalSubArray + "\n");
    }

    public static void main(String[] args) {
        int my_arr[] = { 10, 20, 30, 40, 50 };
        subArrayMethod(my_arr);
    }
}
 */

 //Part4 : without using the helper method to print subarrays, total subarrays count, total sum of subarrays and corrected sum of subarrays.
 /* public class NewSubArray {
    public static void subArrayMethod(int my_arr[]) {
        System.out.println();
        int totalSubArray = 0;
        
        // Start index of subarray
        for (int i = 0; i < my_arr.length; i++) {
            int subArraySum = 0; // Initialize sum for each starting element
            int correctedSum = 0; // Corrected sum calculation
            
            // End index of subarray
            for (int j = i; j < my_arr.length; j++) {
                subArraySum += my_arr[j]; // Maintain sum for subarrays
                correctedSum += subArraySum; // Accumulate sum for subarrays starting at i
                
                // Print subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(my_arr[k] + " ");
                }
                System.out.print("\n");
                totalSubArray++;
            }
            
            System.out.println("-----^^^--------^^^----------^^^-------");
            System.out.println("\nTotal sum_subarray arr[" + my_arr[i] + "] : " + correctedSum + "\n");
            System.out.println("-----------^^^----------^^^---------");
            System.out.print("\n");
        }
        System.out.println("\nTotal subarray is : " + totalSubArray + "\n");
    }

    public static void main(String[] args) {
        int my_arr[] = { 10, 20, 30, 40, 50 };
        subArrayMethod(my_arr);
    }
} */


// PART5 : USING HELPER METHOD


public class NewSubArray {
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
        int arr[] = { 10, 20, 30, 40, 50 };
        subArray(arr);
    }
}
