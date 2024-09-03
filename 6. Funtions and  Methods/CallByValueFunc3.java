
//11.6 Call by Value in Java

//11.6.1 Call by Value as Program 1 : main branch

public class CallByValueFunc3{
    public static void modifyInt(int num){
        num = 15;
    }
    public static void main(String[] args) {
        int a = 5;
        modifyInt(a); //Call by value since int is a primitive type
        System.out.println("After modifyInt( ) : "+a); // output: 5
    }
}