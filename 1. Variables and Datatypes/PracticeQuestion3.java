/* Q3 : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser.
 You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.Scanner;

public class PracticeQuestion3 {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the prices of the three items
        System.out.println("Enter the cost of 3 Items : ");
        System.out.println("------------------------------------");
        System.out.print("Pencil cost : ");
        float pencil = sc.nextFloat();
        System.out.print("Pen cost : ");
        float pen = sc.nextFloat();
        System.out.print("Eraser cost : ");
        float eraser = sc.nextFloat();

        //calculate totalamount  of all 3 items purchased
        float totalamount = pencil + pen + eraser;

        //Define the gst rate for 18%
        float gstrate = 0.18f;

        //Calculate the gstamount 
        float gstamount = totalamount * gstrate;

        //Calculate the final amount after adding the GST
        float finalamount = totalamount + gstamount;

        // Display the Results

        System.out.println("***********************************************");
        System.out.println("Total amount before adding GST : "+totalamount);
        System.out.println("GST Amount (18%) : "+gstrate);
        System.out.println("Final Amount after adding GST : "+finalamount);
        System.out.println("***********************************************");

       // Close the scanner to avoid resource leaks
       sc.close();
        
    }
}
