//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.

public class Example7 {
    public static int example7method(int arr[], int key) {
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int key = 20;
        int index = example7method(arr, key);
        if (index != -1) {
            System.out.println("\nKey : " + key + " index found at : " + index + "\n");
        } else {
            System.out.println("Key : " + key + " not found.\n");
        }
    }
}