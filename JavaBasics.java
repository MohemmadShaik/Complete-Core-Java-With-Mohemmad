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
     int : 4 bytes
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
    float price = 10.6f; // or float price = (float) 10.5; // No error, explicit casting from double to float
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
*/