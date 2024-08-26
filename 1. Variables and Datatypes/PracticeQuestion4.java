/* Q4 : what will be the type of result in the following Java code?
 * 
 * byte b = 4;
 * char c = 'a';
 * short s = 512;
 * int i = 1000;
 * float f = 3.14f;
 * double d = 99.9954;
 * result = (f * b) + (i % c) - (d * s);   // The result variable will be double type because of type conversion.
 * 
  */
public class PracticeQuestion4 {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        //float result = (f * b) + (i % c) - (d * s);// it clearly says its an Error because the  double data type can't be converted to float type.
       double result = (f * b) + (i % c) - (d * s); // So the type of the result is : double data type
       System.out.println("Result is : "+result);

        
    }
}
