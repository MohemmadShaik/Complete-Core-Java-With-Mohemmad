package RivisionTest;

public class Test1 {

    public static void t1(int a1[]) {
        for (int i = 0; i < a1.length; i++) {

            a1[i] = a1[i] + 10;
        }
    }

    public static void main(String[] args) {

        int a1[] = { 1, 2, 3, 4, 5 };
        System.out.println("Before calling t1() : ");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] : " + a1[i]);
        }
        t1(a1);
        System.out.println("After calling t1() : ");
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] : " + a1[i]);
        }
    }
}