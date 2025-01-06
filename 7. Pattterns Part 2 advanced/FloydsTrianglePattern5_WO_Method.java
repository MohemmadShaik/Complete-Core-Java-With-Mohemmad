
//Print the below pattern without using method
/*  
         01
         02 03
         04 05 06
         07 08 09 10
         11 12 13 14 15
*/
//Pattern5 - Floyd's Triangle Pattern with method.
import java.util.*;

class FloydsTrianglePattern5_WO_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n = scanner.nextInt();
        System.out.println("-------------------------");
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < 10)
                    System.out.print("0" + count + "  ");
                else
                    System.out.print(count + "  ");
                count++;
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}