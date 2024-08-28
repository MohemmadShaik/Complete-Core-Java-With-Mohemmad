/* Q2 : Finish the following code so that it prints You have a fever if your temperature is above 100 
   and otherwise prints You don't have a fever.
 */
import java.util.Scanner;
public class JCondStmtPQ2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Your temperature : ");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever with temperature :"+temp);
        }else{
            System.out.println("No fever");
        }

        sc.close();
        
    }
}
