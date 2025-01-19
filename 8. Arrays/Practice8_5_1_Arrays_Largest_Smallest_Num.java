//Practice 5 : Find the largest and smallest number in the given array {2,4,7,3,5,1}
public class Practice8_5_1_Arrays_Largest_Smallest_Num {

    public static int getLargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("\nSmallest number is : "+smallest+"\n");
        return largest; 
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,7,3,5,1};
       System.out.println("\nLargest number is : "+getLargestNum(numbers)+"\n");
    }
}
