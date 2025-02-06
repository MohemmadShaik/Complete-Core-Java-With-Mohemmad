package MyOwnProblems;

public class MyArrayPairs{
	public static void pairsMethod(int given[]){
		int total_Pairs = 0;
        System.out.println();
		for(int i=0; i<given.length-1; i++){
			for(int j=i+1; j<given.length; j++){
				System.out.print("("+given[i]+","+given[j]+") ");
                total_Pairs++;
			}
			System.out.println("\n");
		}
		System.out.println(":::::::::::::::::::::::::::::::::::");
		System.out.println("\nTotal pairs : "+total_Pairs+"\n");
		
	}
	public static void main(String[] args){
		int given[] = {2,4,6,8,10,12};
		pairsMethod(given);
	}
}