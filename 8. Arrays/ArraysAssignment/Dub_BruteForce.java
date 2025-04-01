// Check if there are any duplicates in an array
/* Approach 1 : Using Brute Force to find the dublicates in the given array 
   Time complexity : O(n^2)

   public class Dub_BruteForce{
    public static boolean findDub_using_BruteForce(int arr[]){
		for(int i =0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
				  return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args){
		int arr[] = {3,2,0,8,7,1};
		int arr1[] = {1,2,3,1};
		int arr2[] = {1,2,3,4};
		int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(findDub_using_BruteForce(arr));
		System.out.println(findDub_using_BruteForce(arr1));
		System.out.println(findDub_using_BruteForce(arr2));
		System.out.println(findDub_using_BruteForce(arr3));
	}
}
 */

 //------------------------------------------------------------------------

 /* Approach 2 : Using Arrays Sort to find the dublicates in the given array 
   Time complexity : O(nlogn)

 import java.util.Arrays;

 public class Dub_BruteForce{
	public static boolean findDub_using_BruteForce(int arr[]){
		Arrays.sort(arr); //Sorting the array
		for(int i =0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				  return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int arr[] = {3,2,1,0,8,7,0};
		int arr1[] = {1,2,3,1};
		int arr2[] = {1,2,3,4};
		int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(findDub_using_BruteForce(arr));
        System.out.println(findDub_using_BruteForce(arr1));
		System.out.println(findDub_using_BruteForce(arr2));
		System.out.println(findDub_using_BruteForce(arr3));
	}
} 
*/

//--------------------------------------------------------------------------------

/* Approach 3 : Using HashSet with Enhanced for loop to find the dublicates in the given array 
   Time complexity : O(n)
   space complexity :O(n)


import java.util.HashSet;
   public class Dub_BruteForce{
	public static boolean findDub_using_BruteForce(int arr[]){
		HashSet<Integer> obj = new HashSet<>();

		for(int i : arr){
			if(obj.contains(i)){
				return true;
			}
			
			obj.add(i);
		}
		return false;
	}
	public static void main(String[] args){
		int arr[] = {3,2,1,0,8,7,0};
		int arr1[] = {1,2,3,1};
		int arr2[] = {1,2,3,4};
		int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(findDub_using_BruteForce(arr));
        System.out.println(findDub_using_BruteForce(arr1));
		System.out.println(findDub_using_BruteForce(arr2));
		System.out.println(findDub_using_BruteForce(arr3));
	}
}
*/

//--------------------------------------------------------------------------

/* Approach 4 : Using HashSet with simple for loop to find the dublicates in the given array 
   Time complexity : O(n)
   space complexity :O(n)
*/

import java.util.HashSet;

public class Dub_BruteForce{
	public static boolean findDub_using_BruteForce(int arr[]){
		HashSet<Integer> obj = new HashSet<>();
		for(int i=0; i<arr.length; i++){
			if(obj.contains(arr[i])){
				return true;
			}
			obj.add(arr[i]);
		}
		return false;	
	}
	public static void main(String[] args){
		int arr[] = {3,2,1,0,8,7,0};
		int arr1[] = {1,2,3,1};
		int arr2[] = {1,2,3,4};
		int arr3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		System.out.println(findDub_using_BruteForce(arr));
        System.out.println(findDub_using_BruteForce(arr1));
		System.out.println(findDub_using_BruteForce(arr2));
		System.out.println(findDub_using_BruteForce(arr3));
	}
}

