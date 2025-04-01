//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.

package RivisionTest;

public class Test3 {
	public static int t3method(String arr[], String target){
		for(int i=0; i<arr.length; i++){
			if(arr[i].equalsIgnoreCase(target)){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		String arr[]= {"Apple","Litchi","Banana","Mango"};
		String target = "Mango";
		int result = t3method(arr,target);
		if (result != -1) {
            System.out.println("\nTarget Value : " + target + " found at index : " + result+"\n");
        } else {
            System.out.println("\nTarget Value not exists in the given array.");
        }
		
	}
    
}
