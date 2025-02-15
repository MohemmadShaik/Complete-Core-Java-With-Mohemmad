package MyOwnProblems.RevisionTest;
//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 7 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_1 : Print in reverse order for the sorted array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8_2 : Print in reverse order for the un-sorted array arr[] ={2,4,3,1,0,6,5} using linear search.
//Example 9 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 10 : To print (a) all the sub arrays, (b)total sub arrays count, (c)sum of all sub arrays and (d)total sum of all sub arrays of an arr[] ={10,20,30,40,50}.
//Example 10_1 : Example 10 each part separately discussed for better understanding.
/* ===================================================================================================================================================================== */	


//Example 5 : find the avg and percentage of 3 subjects marks {95,97,99} and the percentage decimal limit with 3.
public class Example5 {
	//total marks
	public static int tot_method(int sub_mrks[]){
		int total_mrks = 0;
		for(int i=0; i<sub_mrks.length; i++){
			total_mrks += sub_mrks[i];
		}
		return total_mrks;
	}
	
	//Average marks
	public static int avg_method(int sub_mrks[]){
		int total_marks = tot_method(sub_mrks);
		int avg = total_marks/sub_mrks.length;
		return avg;
	}
	
	//percentage of 3 subjects
	public static double percentage_method(int sub_mrks[]){
		int total_marks = tot_method(sub_mrks);
	    double percentage = ((double)total_marks/300)*100;
		return percentage;
	}
    public static void main(String[] args) {
		int sub_mrks[]= {90,95,98};
		int total_marks = tot_method(sub_mrks);
        System.out.println("\n==========================================\n");
		System.out.println("Total marks : "+total_marks+"\n");
		System.out.println("==========================================\n");
		int average = avg_method(sub_mrks);
		System.out.println("Average marks : "+average+"\n");
		System.out.println("==========================================\n");
		double percentage = percentage_method(sub_mrks);
		System.out.printf("Percentage of 3 subjects :%.2f%%",percentage);
		System.out.println("\n==========================================\n");  
    }
    
}
