//Example 8 : Write a function to print all pairs of the given array and also print total number of pairs of the given array arr[] ={2,4,6,8,10}.
package MyOwnProblems;

public class Example8_ArrayPairs {
    public static void pairsArray(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            System.out.println();
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + tp + "\n");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairsArray(arr);
    }
}
