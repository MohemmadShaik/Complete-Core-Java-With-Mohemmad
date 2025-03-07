// Check if there are any duplicates in an array
/* Approach1: Sort the array and check if adjacent elements are same
   Time complexity : O(nlogn)
    Space complexity : O(1)
*/
/* package ArraysAssignment;

   import java.util.Arrays;

public class Question1 {
    public static boolean mySort(int arr[]){
        Arrays.sort(arr); //using sorting method
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				return true;
			}
		}
		return false;
				
    }
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       System.out.println("arr[]   : "+mySort(arr));
       System.out.println("nums1[] : "+mySort(nums1));
       System.out.println("nums2[] : "+mySort(nums2));
       System.out.println("nums3[] : "+mySort(nums3));
		
    }
} */

// Approach2: Use a HashSet to store elements and check if the element is already present
// Time complexity : O(n)
// Space complexity : O(n)

package ArraysAssignment;

import java.util.HashSet;

public class Question1 {
    public static boolean myHashSet(int arr[]){
        HashSet<Integer> obj = new HashSet<>();
        for(int i : arr){
            if(obj.contains(i)){
                return true;
            }
            obj.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
       System.out.println("arr[]   : "+myHashSet(arr));
       System.out.println("nums1[] : "+myHashSet(nums1));
       System.out.println("nums2[] : "+myHashSet(nums2));
       System.out.println("nums3[] : "+myHashSet(nums3));
    }
}

/* 
A HashSet is the best choice because:

- Insertion & lookup in HashSet are O(1) on average.
- Handles negative and large numbers efficiently.
- Fits within given constraints.

*/