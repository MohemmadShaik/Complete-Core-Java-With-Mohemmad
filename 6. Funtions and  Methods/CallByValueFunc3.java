

//Program000 : f_callbyvalue_11.6.2(branch)
/* 
//11.6.2 Adding pass by reference value 

public class CallByValueFunc3{
    public static void modifyPrimitiveType(int num){
        num = 30; // This change will not affect the original value
    }
    public static void modifyArray(int[] arr){
        arr[0]=25; // This change will affect the original array
    }
    public static void main(String[] args) {
        int a = 10;
        modifyPrimitiveType(a); //Call by value
        System.out.println("After modifyPrimitiveType( ) : "+a); // output: 10

        int[] num = {1,2,3};
        modifyArray(num); // Pass by reference value
        System.out.println("After modifyArray( ) : "+num[0]); // output: 25
    }
}
 */
//===========================================================================
 //11.6 Call by value in Java

//11.6.1 PART 1 : Call by Value Using a method without a return type.
/* - Using primitive type (here int is a primitive data type) */
/* 
 public class CallByValueFunc3{
    public static void modifyPrimitiveType(int num){
        num = 30; // This change will not affect the original value
    }
    public static void main(String[] args) {
        int a = 10;
        modifyPrimitiveType(a); //Call by value
        System.out.println("After modifyPrimitiveType( ) : "+a); // output: 10
    }
}

*/

//11.6.1 PART 2 : Call by Value Using a method with a return type.
/* - Using primitive type (here int is a primitive data type) */
/* 
public class CallByValueFunc3{
    public static int modifyPrimitiveType(int num){
        num = 30; // This change will not affect the original value
        return num;
    }
    public static void main(String[] args) {
        int a = 10;
        a = modifyPrimitiveType(a); //Call by value
        System.out.println("After modifyPrimitiveType( ) : "+a); // output: 30
    }
}
*/

//11.6.2 PART 1 : Call by Value  Using a method without a return type.
/* - Using non-primitive type (here String is a non-primitive data type) */


/* public class CallByValueFunc3 {
         public static void modifyNonPrimitiveType(String str){
            str = "World"; //This change will not affect the original value because Scope of str is limited to this method only 
         }
    public static void main(String[] args) {
        String text = "Hello";
        modifyNonPrimitiveType(text);
        System.out.println("After modifyNonPrimitiveType( ) : "+text); // output : Hello
    }
}
*/


//11.6.2 PART 2 : Call by Value Using a method with return type.
/* - Using non-primitive type (here String is a non-primitive data type) */
/* 
public class CallByValueFunc3{
    public static String modifyNonPrimitiveType(String str){
        str = "World";
        return str;
    }
    public static void main(String[] args) {
        String text = "Hello";
        text = modifyNonPrimitiveType(text);
        System.out.println("After modifyNonPrimitiveType( ) : "+text); //World
    }
} 
    */

//11.6.3 Example with Non-Primitive Type and a method with no return type 

class Box {
    int value;
}

public class CallByValueFunc3 {
    public static void modifyObject(Box box) {
        box.value = 30; // This change will affect the original object
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.value = 10;
        modifyObject(b); // Call by value (copy of reference)
        System.out.println("After modifyObject( ) : " + b.value); // output: 30
    }
}

/* 

Note 1 : 
======
11.6.1 PART1 ==> The scope of local variables (num in your example) is indeed limited to the method, 
                 so changes to primitives do not affect the original value.

11.6.3       ==> for non-primitive types, while the reference itself cannot be
                 changed (within the method's scope), the object's internal state
                 can be modified, affecting the original object outside the method.
Note 2 : 
======
Primitive Types (e.g., int): 
---------------------------
The copy of the value is passed, so changes to the local variable
in the method do not affect the original variable.

Non-Primitive Types (e.g., Box object):
--------------------------------------
The copy of the reference is passed, so changes to the object’s state
through the reference do affect the original object.

*/