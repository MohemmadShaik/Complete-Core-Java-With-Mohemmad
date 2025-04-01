
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
package RivisionTest;

public class Test2 {
    public static int t2method(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 60, 76, 98, 10, 73 };
        int target = 73;
        int result = t2method(arr, target);
        if (result != -1) {
            System.out.println("\nTarget Value : " + target + " found at index : " + result+"\n");
        } else {
            System.out.println("\nTarget Value not exists in the given array.");
        }
    }
}