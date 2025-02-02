//Example 4 : To find the sum of all the elements in the given arr[] ={10,20,30,40,50}
package MyOwnProblems;

public class Example4_ArraySum {
	public static void arrSum(int arr[]){
		int sum =0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		System.out.println("\nSum of arr[] elements : "+sum+"\n");
	}
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
		arrSum(arr);
	}
}
