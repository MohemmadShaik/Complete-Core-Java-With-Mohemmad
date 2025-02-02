//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
package MyOwnProblems;

public class Example5_AvgAndPercentSubjects {
	
	public static void marks(int sub[]){
		int tot_marks = 0;
		int avg_marks = 0;
		double percentage = 0;
		for(int i=0; i<sub.length; i++){
			tot_marks +=sub[i];
		}
        avg_marks = tot_marks/sub.length;
        percentage = ((double) tot_marks/300) * 100;
		System.out.println("\nTotal marks of three subjects : "+tot_marks+"\n");
		System.out.println("\nAvg of three subjects : "+avg_marks+"\n");
		System.out.printf("\nPercentage of marks : %.2f%% ",percentage);
        System.out.println("\n");
	}
    public static void main(String[] args){
		int sub[] = {90,95,98};
		marks(sub);
	}
}