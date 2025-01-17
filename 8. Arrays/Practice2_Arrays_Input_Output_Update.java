import java.util.Scanner;

public class Practice2_Arrays_Input_Output_Update {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("length of array = "+marks.length);
        System.out.print("Enter phy marks : ");
        marks[0] = sc.nextInt();//phy
        System.out.print("Enter chem marks : ");
        marks[1] = sc.nextInt();//Chem
        System.out.print("Enter math marks : ");
        marks[2] = sc.nextInt();//math

        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);
     /*   
        //modify or update math marks to 97 
         marks[2] =97;
         System.out.println("math updated marks : "+marks[2]);
         
         //modify or update the chem marks by adding 2 marks 
         marks[1] = marks[1]+2;
         System.out.println("chem updated marks : "+marks[1]);
         System.out.println("\n");
 */
         //Q) Average of of three subjects marks 
         int average = (marks[0] + marks[1] + marks[2])/3;
         System.out.println("average of marks : "+average);

         //Q) Percentage of three subjects marks
         double percentage = (((double)marks[0]+marks[1]+marks[2])/300) * 100;
         System.out.println("Percentage : "+percentage);

         //Q) How to limit the decimal places of percentage

        System.out.printf("Percentage : %.2f ", percentage);

    }
}
