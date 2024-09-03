//11.6 Call by value in Java

//11.6.1 Call by Value as Program 1 : main branch

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