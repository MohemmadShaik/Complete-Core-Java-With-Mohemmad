package MyOwnProblems;

public class Ary_Rev{
	public static void arrayRev(int g_arr[]){
		int start = 0 , end = g_arr.length-1;
		while(start<end){
			int temp = g_arr[start];
			g_arr[start] = g_arr[end];
			g_arr[end] = temp;
            start++;
            end--;
		}
	}
	public static void main(String[] args){
		int g_arr[] = {2,4,3,1,0,6,5};
		arrayRev(g_arr);
		for(int i=0; i<g_arr.length; i++){
			System.out.print(g_arr[i]+" ");
		}
	}
}