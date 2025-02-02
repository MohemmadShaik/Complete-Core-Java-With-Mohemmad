//Example 1 : To increment all the elements of arr[] to 10.
package MyOwnProblems;
public class Example1_ArrayIncrement{
	public static void arrayIncrement(int arr[]){
		for(int i=0; i<arr.length; i++){
			arr[i] = arr[i]+10;
		}	
	}
	public static void main(String[] args){
		int arr[] = {2,4,6,8,10,12};
		arrayIncrement(arr);
		
        for(int i =0 ; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
