//Example 9 : To print all the sub arrays of an array arr[] ={2,4,6,8,10} and also print the count of all sub arrays.
package MyOwnProblems;

public class Example9_PrintSubArrays {
	public static void subArrayPrint(int arr[]){
        int totalSubArray = 0;
        System.out.println();
		//start
		for(int i=0; i<arr.length; i++){
			//end
			for(int j=i; j<arr.length; j++){
				//print subarray
				for(int k=i; k<=j; k++){
					System.out.print(arr[k]+" ");
				}
                totalSubArray++;
                System.out.println();
			}
            System.out.println();
            System.out.println("* * * * * * * * ");
		}
        System.out.println("-----------------------------");
        System.out.println("Total number of pairs : "+totalSubArray+"\n");
	}
    public static void main(String[] args){
		int arr[] = {2,4,6,8,10};
		subArrayPrint(arr);
	}
}
