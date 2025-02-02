//Example 7 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.
package MyOwnProblems;

public class Example7_ReverseArray {
    public static void revArray(int arr[]){
	int start = 0, end = arr.length-1;
	while(start<end){
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		start++;
		end--;
	}
}
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70};
		revArray(arr);
        System.out.println("\nReversed array : \n");
		for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
		}
        System.out.println("\n");
	}
}
