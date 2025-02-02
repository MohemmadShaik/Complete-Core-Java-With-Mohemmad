//Example 6 : To find the index of an element 50 in an myarr[] ={10,20,30,40,50,60,70} using binary search.
//Note: The array should be sorted in ascending order.
package MyOwnProblems;

public class Example6_ArrayIndexFind_BinarySearch {
	public static int findIndexBinSearch(int myarr[], int key){
	 int start = 0 , end = myarr.length-1;
	 while(start<=end){
		 int mid = (start + end)/2;
		 if(myarr[mid] == key){
			 return mid;
		 }if(myarr[mid] > key){//left
		    end = mid-1;
		 }else{//right
			 start = mid+1;
		 }
	 }
	 return -1; //if key value not found
	}
    public static void main(String[] args){
		int myarr[] = {10,20,30,40,50,60,70};
		int key = 300;
		int index= findIndexBinSearch(myarr, key);
		if(index!=-1){
			System.out.println("\nKey : "+key+" index found at : "+index+"\n");
		}else{
			System.out.println("\nKey : "+key+" not found in myarr[].\n");
		}
	}
}
