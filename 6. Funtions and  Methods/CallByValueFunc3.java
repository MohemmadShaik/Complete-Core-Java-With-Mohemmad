//11.6 Call by Value in Java

public class CallByValueFunc3{
    public static void modifyPrimitiveType(int num){
        num = 15;
    }
    public static void main(String[] args) {
        int a = 5;
        modifyPrimitiveType(a); //Call by value
        System.out.println("After modifyPrimitiveType( ) : "+a); // output: 5
    }
}