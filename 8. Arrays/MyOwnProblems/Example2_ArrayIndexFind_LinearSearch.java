//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
package MyOwnProblems;

class Example2_ArrayIndexFind_LinearSearch{
	public static int arrayIndex(int arr[], int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int arr[] = {2,4,6,8,10,12};
		int key =4;
		int index= arrayIndex(arr,key);
		if(index!=-1){
			System.out.println("\nkey : "+key+" index found at : "+index+"\n");
		}else{
			System.out.println("Key not found.\n");
		}
	}
}
