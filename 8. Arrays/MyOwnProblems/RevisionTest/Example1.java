package MyOwnProblems.RevisionTest;

//Example 1 : To increment all the elements of arr[] to 10.
//Example 2 : To find the index of element 98 in an arr[] ={30,60,76,98,10,73} using linear search.
//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
//Example 4 : To find the sum of all the elements in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 4 : To find the largest and smallest number in the given arr[] ={20,65,90,99,32,43,2,1,0}
//Example 5 : find the avg and percentage of 3 subjects marks and the percentage decimal limit with 3.
//Example 6 : To find the index of an element 50 in an arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 7 : Print in reverse order for the given array arr[] ={10,20,30,40,50,60,70} using binary search.
//Example 8 : Write a function to print all pairs of the given array and also print total number of pairs of the given array.
//Example 9 : To print all the sub arrays of an array arr[] ={2,4,6,8,10} and also print the total number of sub arrays and also total number of pairs.
	
	//Example 1 : To increment all the elements of arr[] to 10.
	public class Example1{
		public static void mt_Method(int mt[]){
			for(int i=0; i<mt.length; i++){
				mt[i] = mt[i] + 10;
			}
		}
        public static void main(String[] args){
            int mt[] = {2,4,6,8,10};
            int len = mt.length;
            System.out.println("\nLength of mt[] : "+len);
            System.out.println();
            System.out.print("Before increment 10 to each element in mt[] : ");
            for(int i=0; i<mt.length; i++){
            System.out.print(mt[i]+" ");
            }
            mt_Method(mt);
            System.out.println();
            System.out.print("\nAfter increment 10 to each element in mt[] : ");
            for(int i=0; i<mt.length; i++){
                System.out.print(mt[i]+" ");
            }
            System.out.println("\n");
	}
}