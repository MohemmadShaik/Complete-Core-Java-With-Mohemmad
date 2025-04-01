//package ArraysAssignment;

class Q2{
	public static int findIndex(int a1[], int key){
		int start = 0, end = a1.length-1;
		while(start <= end){
			int mid = start + (end - start)/2;
			if(a1[mid] == key){
				return mid;
			}
			if(a1[start] <= a1[mid]){
				if(a1[start] <= key && a1[mid] > key){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}else{
				if(a1[mid] < key && a1[end] >= key){
					start = mid + 1;
				}else{
					end = mid - 1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int a1[] = {1};
		int key = 0;
		System.out.println(findIndex(a1, key));
	}
}