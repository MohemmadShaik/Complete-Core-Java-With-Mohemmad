//Practice 8 : Write a function to print all pairs of the given array.
class Practice8_7_ArrayPairs{
    public static void arrayPairs(int arr[]){
		for(int i=0; i<arr.length; i++){
			int current = arr[i]; //2,4,6,8,10
            System.out.print("\n");
			for(int j=i+1; j<arr.length; j++){
				System.out.print("("+current+","+arr[j]+")");
			}
			System.out.print("\n");
		}
        
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        arrayPairs(arr);
    }
}