// Find the index of the target element in the rotated sorted array.

// Approach1 : Using linear search
// Time complexity : O(n)

/* package ArraysAssignment;

public class Question2{
	public static int findArrIndex(int arr[], int target){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == target){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		 //int arr[] = {4,5,6,7,0,1,2};
		//int target = 0;

         //int arr[] = {4,5,6,7,0,1,2};
		//int target = 3; 

        int arr[] = {1};
        int target = 0;                                

		int result = findArrIndex(arr, target);
		if(result != -1){
			System.out.println("index found at : "+result);
		}else{
			System.out.println("index not found : "+result);
		}
	}
}
 */

// Approach2 : Using binary search with little modification in the code to find the index of the target element in the rotated sorted array.
// Time complexity : O(logn)

package ArraysAssignment;

public class Question2{
        public static int searchArrayIndex(int arr[], int target){
            int start = 0, end = arr.length-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(arr[mid] == target){
                    return mid;
                }
                //Identify which half is sorted
                if(arr[start] <= arr[mid]){
                    if(arr[start] <= target && arr[mid] > target){
                         end = mid - 1;
                    }else{
                         start = mid + 1;
                   }
               }else{
                   if(arr[mid] < target && arr[end] >= target){
                       start = mid + 1;
                   }else{
                           end = mid -1;
                   }
               }
            }
            return -1;
        }
           
        public static void main(String[] args){
            /* int arr[] = {4,5,6,7,0,1,2};
            int target = 0; */

            int arr[] = {1};
            int target = 0;
           int result = searchArrayIndex(arr, target);
           if(result != -1){
               System.out.println("Index found at : "+result);
           }
           else{
               System.out.println("index found at : "+result);
           }
        }
}