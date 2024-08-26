/* Q2 : In a program, input the side of a square. You have to output the area of the square.
   Hint : Area of a square is (side * side)
 */

import java.util.Scanner;

public class PracticeQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side of the square : ");
        int side = sc.nextInt();
        int Area = side * side;
        System.out.println("------------------------------");
        System.out.println("Area of square is : "+Area);
        System.out.println("------------------------------");



        
    }
    
}
