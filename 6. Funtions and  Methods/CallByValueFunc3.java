//Program2 : f_callbyvalue_11.6.2(branch)
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