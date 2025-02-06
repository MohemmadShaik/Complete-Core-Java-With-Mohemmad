package MyOwnProblems;

public class NewSubArray {
    public static void subArrayMethod(int my_arr[]) {
        System.out.println();
        int totalSubArray = 0;
        // start
        for (int i = 0; i < my_arr.length; i++) {
            // end
            for (int j = i; j < my_arr.length; j++) {
                // print subarrays
                for (int k = i; k <= j; k++) {
                    System.out.print(my_arr[k] + " ");
                }
                totalSubArray++;
                System.out.print("\n");
            }
              System.out.println("------------------------------");
              System.out.print("\n");
        }
        System.out.println("Total subarray is : " + totalSubArray);
    }

    public static void main(String[] args) {
        int my_arr[] = { 10, 20, 30, 40, 50, 60 };
        subArrayMethod(my_arr);
    }
}
