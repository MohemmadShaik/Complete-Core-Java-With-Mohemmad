//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}

package RivisionTest;

public class Test4 {
	public static int arrSum(int arr[]){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			 sum += arr[i];
		}
        return sum;
	}
    public static void main(String[] args){
		//int arr[] ={20,65,90,99,32,43,2,1,0};
        int arr[] = { 1, 2, 3, 4, 5 };
		int add = arrSum(arr);
		System.out.println(add);
	}
}
