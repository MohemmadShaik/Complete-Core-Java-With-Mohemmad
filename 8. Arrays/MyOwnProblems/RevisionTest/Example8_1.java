//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_1 : Print in reverse order for the sorted array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_2 : Print in reverse order for the un-sorted array arr[] ={2,4,3,1,0,6,5} using linear search.
//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 10 : To print (a) all the sub arrays, (b)total sub arrays count, (c)sum of all sub arrays and (d)total sum of all sub arrays of an arr[] ={10,20,30,40,50}.
//Example 10_1 : Example 10 each part separately discussed for better understanding.
/* ===================================================================================================================================================================== */	

//Example 8_1 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search since the given array is already sorted.
package MyOwnProblems.RevisionTest;
public class Example8_1 {
	public static void reverseArr(int arr[]){
		int start = 0, end = arr.length-1;
		while(start<end){
			int temp = arr[start];
			   arr[start] = arr[end];
			   arr[end] = temp;
			   start++;
			   end--;
		}
	}
    public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70};
		System.out.print("\nGiven Array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
        System.out.println("\n\n=====(-)============(-)==========(-)==========");
		reverseArr(arr);
		System.out.print("\nReversed Array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
}
