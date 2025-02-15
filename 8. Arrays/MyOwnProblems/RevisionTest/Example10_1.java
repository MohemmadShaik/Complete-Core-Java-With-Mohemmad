package MyOwnProblems.RevisionTest;

public class Example10_1 {
    public static void arymethod(int ary[]) {
        int totSubArr = 0; // Total count of subarrays
        System.out.println();
        int tot_Elements_Sum= 0;
        for (int i = 0; i < ary.length; i++) {
            int subArrSum = 0; // Reset for every new starting element
            int totSubArrSum = 0; // Total sum of subarrays
            
            for (int j = i; j < ary.length; j++) {
                subArrSum += ary[j]; // Add current element to sum
                totSubArrSum += subArrSum; // Add current sum to total sum
                 tot_Elements_Sum += subArrSum; //Total sum of all elements
                // Print the subarray from i to j
                for (int k = i; k <= j; k++) {
                    System.out.print(ary[k] + " ");
                }
                
                System.out.println(); // Move to next line
                totSubArr++; // Increment total subarray count
            }
            System.out.println("- - - - - - - - - - - - - - - - - - ");
            // Print sum after all subarrays starting from ary[i] are processed
            System.out.println("Total sum_subarray arr[" + ary[i] + "] : " + totSubArrSum + "\n");
        }

        System.out.println("\n------------------------------------");
        System.out.println("Total count of subArrays : " + totSubArr+"\n");
        System.out.println("Total sum of all elements of the sub array  : " + tot_Elements_Sum+"\n");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        int ary[] = {10, 20, 30, 40, 50};
        arymethod(ary);
    }
}
