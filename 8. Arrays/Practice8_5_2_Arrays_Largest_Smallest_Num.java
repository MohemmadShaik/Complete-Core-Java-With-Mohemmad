//Different approach to print larger and smaller value for a given array.
public class Practice8_5_2_Arrays_Largest_Smallest_Num {
    public static int printBigSmallNum(int myNum[], boolean findBig) {
        if (findBig) {
            // finding big number
            int big = Integer.MIN_VALUE;
            for (int i = 0; i < myNum.length; i++) {
                if (big < myNum[i]) {
                    big = myNum[i];
                }
            }
            return big;
        } else {
            // finding small number
            int small = Integer.MAX_VALUE;
            for (int i = 0; i < myNum.length; i++) {
                if (small > myNum[i]) {
                    small = myNum[i];
                }
            }
            return small;
        }
    }

    public static void main(String[] args) {
        int myNum[] = { 3, 5, 2, 0, 12, 11 };

        int small = printBigSmallNum(myNum, false);
        System.out.println("\nSmall number is :" + small);
        int big = printBigSmallNum(myNum, true);
        System.out.println("\nBig number is :" + big + "\n");

    }
}