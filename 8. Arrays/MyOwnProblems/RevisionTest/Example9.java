//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={10,30,5,50,20,80,5}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 10 : To print all the sub arrays of an array arr[] ={2,4,6,8,10} and also print the total number of sub arrays and also total number of pairs.
/* ======================================================================================================================================================== */

//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
package MyOwnProblems.RevisionTest;

public class Example9 {
	public static void arrayPair(int arr[]){
        int tp=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				System.out.print("["+arr[i]+","+arr[j]+"]");
                tp++;
			}
            System.out.println("\n");
		}
        System.out.print("------------------------------------\n");
        System.out.println("Total number of pairs : "+tp+"\n");
	}
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50};
        System.out.println();
		arrayPair(arr);
	}
    
}
