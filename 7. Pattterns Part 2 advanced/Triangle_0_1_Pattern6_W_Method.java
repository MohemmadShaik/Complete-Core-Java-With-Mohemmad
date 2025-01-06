//0-1 triangle pattern
/* 
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
*/
class Triangle_0_1_Pattern6_W_Method {
    public static void triangle01_method(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        triangle01_method(5);
    }
}