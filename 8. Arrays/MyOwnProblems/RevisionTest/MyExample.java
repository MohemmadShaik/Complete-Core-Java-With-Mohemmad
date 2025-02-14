public class MyExample {
    public static int myMethod(int arr[], boolean findBig) {
        if (findBig) {
            int big = Integer.MIN_VALUE; // -ve infinity
            for (int i = 0; i < arr.length; i++) {
                if (big < arr[i]) {
                    big = arr[i];
                }
            }
            return big;
        } else {
            int small = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (small >arr[i]) {
                    small = arr[i];
                }
            }
            return small;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 60, 90, 5, 99 };
        System.out.println("===<>======<>====<>====<>====<>====<>===");
        int big = myMethod(arr, true);
        System.out.println("\nBig number : " + big + "\n");
        int small = myMethod(arr, false);
        System.out.println("Small number : " + small + "\n");
    }
}