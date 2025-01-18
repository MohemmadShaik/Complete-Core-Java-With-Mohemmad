/*Practice1 : how to declare an array of integer type, string type and fetch the elements stored inside the array. */

import java.util.Arrays;

class Practice8_1_Arrays_Creation {
    public static void main(String[] args) {
        // marks[] of length 10
        int marks[] = new int[10];
        int len = marks.length;
        System.out.println("Array length : " + len);
        for (int i = 0; i <= marks.length - 1; i++)
            System.out.print(marks[i] + ", ");

        // numbers[] of length = 4
        int numbers[] = { 1, 3, 5, 8 };
        int len2 = numbers.length;
        System.out.println("\n\nnumbers[] length : " + len2 + "\n");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print("number[" + i + "] are : " + numbers[i] + "\n");
        }
        // fruits[] of length 3
        String fruits[] = { "Apple", "Mango", "Orange" };
        int len3 = fruits.length;
        System.out.println("String length :" + len3);
       //Q) How to fetch the elements of fruits[] using simple for loop?
       System.out.println("\nUsing Simple for loop."); 
       for(int i=0; i<fruits.length;i++){
              System.out.println("fruits["+i+"] : "+fruits[i]+"\n");
        }

        //Q) How to fetch the elements of fruits[] using Enhanced for loop?
        System.out.println("\nUsing Enhanced for loop.");
        System.out.println("-------------------------");
        for(String fruit : fruits){
            System.out.println("Fruits : "+fruit);
        }

        //Q) How to fetch the elements of fruits[] using Arrays.toString()
        System.out.println("fruits :"+Arrays.toString(fruits));
    }
}