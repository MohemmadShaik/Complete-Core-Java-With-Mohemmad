package MyOwnProblems;

class Example2{
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
