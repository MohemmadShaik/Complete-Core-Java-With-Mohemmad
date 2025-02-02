//Example 1 : To increment all the elements of arr[] to 10
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 4 : To find the largest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 7 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.

//Example2
public class Test {
    public static int binSearch(int arr[], int key){
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //comparison
            if(arr[mid] == key){
                return mid; //found
            }else if(arr[mid]<key){ //right
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
      public static void main(String[] args) {
        int arr[] = {1,2,3,5,60,80,86,95,99};
        int key = 5;
       int index =  binSearch(arr, key);
       if (index == -1){
        System.out.println("\n"+key+" element is not found in the arr[].\n");
       }else{
           System.out.println("\n"+key+" element - about index found at : "+index+"\n");
       }
    }
}