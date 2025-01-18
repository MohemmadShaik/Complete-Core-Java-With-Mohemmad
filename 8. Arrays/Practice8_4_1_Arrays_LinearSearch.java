//Practice 4.1 : Linear Search for given array of numbers.
//LinearSearch : Finding the index value of an array which contains numbers.
public class Practice8_4_1_Arrays_LinearSearch {
    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length;i++){
            if (number[i]==key){
                return i;
            }   
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int number[] = {2,6,5,15,10,3,16};
        int key =16;
       int index = linearSearch(number, key);
       if(index == -1){
        System.out.println("\nKey not found.");
       }else{
        System.out.println("\nKey found at index :"+index);
       }
       System.out.println();
    }
}
