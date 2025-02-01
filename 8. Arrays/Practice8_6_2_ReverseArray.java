//Practice 7 : Reverse the elements in an array arr[] ={20,30,49,67,78,88,90} using a function.
public class Practice8_6_2_ReverseArray {
    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 49, 67, 78, 88, 90 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}