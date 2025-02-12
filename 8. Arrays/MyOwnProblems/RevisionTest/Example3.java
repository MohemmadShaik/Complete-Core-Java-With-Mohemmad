package MyOwnProblems.RevisionTest;

//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 4 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 7 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 9 : To print all the sub arrays of an array arr[] ={2,4,6,8,10} and also print the total number of sub arrays and also total number of pairs.
/* ======================================================================================================================================================== */

//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.

public class Example3 {
    public static int example3_Method(String arr[], String key){
		for(int i=0; i<arr.length; i++){
			/* if(arr[i] == key){
				return i;
			} */
			if(arr[i].equalsIgnoreCase(key)){
				return i;
			}
		}
		return -1; // key not found
	}

    public static void main(String[] args) {
        String arr[] = { "Apple", "Litchi", "Banana", "Mango" };
        String key = "litchi";
        int index = example3_Method(arr, key);
        System.out.println();
        if (index != -1) {
            System.out.print(key + " found at index : " + index + "\n");
        } else {
            System.out.print(key + " not found in the given arr[]. \n");
        }
        System.out.println();
    }
}
