/* 6. Variables and Datatypes

6.1 Creating Java File
6.2 Boilerplate Code
6.3 Output in Java
6.4 Print a Pattern
6.5 Variables in Java	
6.6 Data Types in Java
6.7 Sum of a b
6.8 Comments in Java
6.9 Input in Java
6.10 Sum of a b ( Input from User )
6.11 Product of a b
6.12 Area of a Circle
6.13 Type Conversion
6.14 Type Casting
6.15 Type Promotion in Expression
6.16 How does Java code run
6.17 Variable Questions FAQ's */


/*  6.1 Creating a Simple Java File program by saying Hello to the whole World through java Program 

public class JavaBasics {

    public static void main(String[] args) {

    System.out.println("Hello World");
    }
}

*/

/*  6.2 Boilerplate Code 

public class JavaBasics {

    public static void main(String[] args) {
          
           // Here we write our coding stuff...
    }
}

*/

// 6.5 Variables in Java 

/* Variables are like containers which can store values w.r.t their types .

-- The values stored in a variables get varied by the User as per the requirement.
-- The values which are constant are called literals.

Note :
        Numeric literals : 1 2 3 4 5 6 7 8 9 0 
        Charecter literals : 'a' 'b' 'c' 'd' ....... '@' '#' '*' '$' and all other special symbols...
All the numeric and charecter literals values are universal (which means at any cost these values won't be changed)

Eg : If we want to find the perimeter of a Rectangle ,
We know the formula  : 
               2 * ( a + b)  

Here : 2 is constant value which never going to change so it's a literal 
where a and b values gets varied as per user requirement.
           So we call a and b as variables. 
 
public class JavaBasics {

    public static void main(String[] args) {
          
           int a = 100;
           int b = 25;
           String name = "Virat";

           System.out.println(a); // output 100
           System.out.println(b); // output 25
           System.out.println(name); // output Virat

           a = b;
           System.out.println(a); // output 25
           a = 50;
           System.out.println(a); // output 50
           
    }
}

*/

//6.6 Datatypes in Java

/* Primitive Data types and their sizes :
   ====================================
     byte : 1 byte
     boolean : 1 byte
     char : 2 bytes
     short: 2 bytes
     int : 4 bytes ( Max length = 2,147,483,647 (in words :  2 Billion, 147 Million, 483 Thousand, 647) , Min length = -2,147,483,647)
     float : 4 bytes
     long : 8 bytes
     double : 8 bytes 
     
     
     Non-Primitive Data types :
     ========================
     
     String
     Array
     Class
     Object
     Interface
     */

 /* public class JavaBasics {

    public static void main(String[] args) {

    // Primitives Data Types

    byte b2 = 8;
    System.out.println(b2);
    char ch = 'a';
    System.out.println(ch);
    boolean var = true;
    System.out.println(var);
    float price = 10.6f; // or float price = (float) 10.6; // No error, explicit casting from double (i.e 10.6) to float (i.e 10.6f) . Since By Default Decimal Numbers are treated as double datatype 
    System.out.println(price);
    int number = 25;
    System.out.println("int number :  "+number);

    // 6.7 Sum of a and b 

    int a = 10;
    int b = 20;
    int sum = a + b;
    System.out.println("Addition of "+a+"  +  "+b+" is : "+sum);
    }
}
   
*/

/* 6.9 Input in Java
next
nextLine
nextByte
nextBoolean
nextInt
nextShort
nextLong
nextFloat
nextDouble




import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input1 = sc.next(); // input1 takes only single word
        // System.out.println(input1);

        // String input2 = sc.nextLine(); // input2 takes two or more words or a complete sentence
        // System.out.println(input2);

    

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // boolean flag = sc.nextBoolean();
        // System.out.println(flag);

        // 6.10 Sum of the two numbers given by the user
        // 6.11 Product of two numbers given by the user
        
        int a;
        int b;
        System.out.println("\n");
        System.out.println("--------------------------------\n");
        System.out.print("Enter a value : ");
         a = sc.nextInt();
         //System.out.println("\n");
        System.out.print("Enter b value : ");
         b = sc.nextInt();
        int  sum= a+b;
        int prod= a*b;
        System.out.println("------------------\n");
        System.out.println("Addition of "+a+" + "+b+" = "+sum);
        System.out.println("------------------\n");
        System.out.println("Product of "+a+" X "+b+" = "+prod);

        // 6.12 Area of Circle
        System.out.print("Enter the Circle radius : ");
        double r = sc.nextDouble();
        
        r = 3.14 * r * r;
        System.out.println("Area of Circle where radius is "+r+" : ");
    }
}
*/

//6.13 : Type Conversion : 

/* Also known as widening conversion or Implicit conversion which means small datatypes  get stored into the larger compatible datatypes.

  Conversion can only happen when : 
  a. type compatible   // * int <--> float , int <--> double are called as compatible types since int, float or double represents numerical values to do arthemetic, counting and mathematical calculations  
                      // But  int <--> boolean are incompatible because int represents numerical values where boolean represents logical values (i.e either true or false) mostly used for decision-making, conditions, and logical operations.
  
  b. destination type > source type // Which means the source type must be lesser than the destination type 
  
  byte -> short -> int -> float -> long -> double
  
 ==================================================== */

/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
          
         int a = 10;
         long b = a; // type is compatible and also destination > source (i.e long > int )

        System.out.println(b); // output 10

        //  long a1 = 10;
        //  int b1 = a1; // type is incompatible since b1 < a1
        //  System.out.println(b1);

    // Example of implicit or widening conversion

      Scanner sc= new Scanner(System.in);
    // int number = sc.nextFloat(); // it's incompatible type since int < float type
    // System.out.println(number); 
   
    System.out.print("Enter Any integer type here to convert into float type : ");
    float number = sc.nextInt(); //it's a compatible type since float > int type
    System.out.println(number); 

    }
} 
    */

// 6.14 : Type Casting : 

/* - Its also known as Explicit conversion of the data types 
   - You know their will be a LOSS OF DATA when explicitly converting 
     the higher data type to lower data type such conversion can be 
     done using Type Casting.

     Eg : float a = 55.89f;
          int b = a; // its an Error Since destination type < Source type , Type conversion is not possible
          int b = (int) a; //  TYPE CASTING : Narrowing or explicitly converting the float value to int value

*/
/* public class JavaBasics {

    public static void main(String[] args) {
          
           float a = 55.89f;
           System.out.print("a value is : "+a); //output : 55.89
           System.out.print("\n"); 
           int b = (int) a; // Narrowing the float value to int value
           System.out.println("b value is : "+b); // output : 55


          // Converting char to number types :
           char ch1 = 'a'; // output : 97
           char ch2 = 'b'; // output : 98
           char ch3 = 'z'; // 'c' = 99 , 'd' = 100 , 'e' =101, ...., 'z' = 122 

           int number1 = ch1;
           int number2 = ch2;
           int number3 = ch3;

           System.out.println("char 'a' value is : "+number1);
           System.out.println("char 'b' value is : "+number2);
           System.out.println("char 'z' value is : "+number3);
           System.out.println("========================================");

           char ch4 = 'A'; // output : 65
           char ch5 = 'B'; // output : 66
           char ch6 = 'Z'; // 'C' = 67 , 'D' = 68 , 'E' = 69, ...., 'Z' = 90

           int number4 = ch4;
           int number5 = ch5;
           int number6 = ch6;

           System.out.println("char 'A' value is : "+number4);
           System.out.println("char 'B' value is : "+number5);
           System.out.println("char 'Z' value is : "+number6);
 
    }
} */

// 6.15 : Type Promotion in Expressions : 

/* 1. Java automatically promotes each byte,short, or char operand to int 
      when evaluating an expression.
   2. If one operand is long, float or double the whole expression is promoted to 
      long, float, or double respectively.
  
 */

 public class JavaBasics {

    public static void main(String[] args) {
          
        //Point 1 :
           char a = 'a';
           char b = 'b';
         //  char diff = b - a; //Throw Error Since b-a is now an integer value since we used an expression and which cannot be stored in char data type. We need to explicitly type cast the int value to char data type
           byte c = 3;
           short d = 20 ;
           System.out.println("a value is : "+(int)a); //type casting : Here I want the value of a 
           System.out.println("b value is : "+(int)b);
           System.out.println(a); // output : a ,  since it's not a type promotion because here we didn't done any expresional operations
           System.out.print("subtract "+b+" from "+a+" : "+(b-a)); // It's call Type promotion when we use + , - , * , / as expressions then Java automatically converts it into int type without explicitly doing any type casting 
           // byte bt = a+b+c+d; // Here a+b+c+d is now an int type and we are trying the int value to get store in byte type which is not at all possible. To make it possible we need to do type casting of byte type as shown below
           byte bt = (byte) (a+b+c+d);
           System.out.println(a+b+c+d);// Here will get some random output but not an error because here the data types may be different but as we are using expressional operations in between the operand then in such cases  Java automatically converts it into int type without doing any explicit type casting which is simply known as TYPE PROMOTION

           //Point 2 :

           long p = 10;
           float q = 12;
           int r = 14;
           double s = 9;
           long t = (long) (p+q+r+s); // Here p,q,r,s all are different data types but when we added this it becomes an expressional operation and java automatically takes the larger data type as the default data type . 
                                      //As we can see here the double data type is the largest among int, long and float data types. So p+q+r+s is double type so here explicitly we need to do the type casting to convert double to long data type.
           System.out.println(t);
           double u = p+q+r+s;
           System.out.println(u);

    }
}

 
