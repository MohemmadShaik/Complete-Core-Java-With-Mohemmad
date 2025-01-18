//Practice 3.3 : Difference b/w Pass by value VS Pass by reference
//Pass by value :
public class Practice8_3_3_PassByVal_VS_PassByRef_Difference{
  public static void change(int num) {
        num = 80;
        System.out.println("\n inside the change() :" + num);//80 
        // inside the method num value changed to 80 but in main it remains unchanged.
    }
    public static void main(String[] args) {
        // Pass by value
        int num = 10;
        change(num);
        System.out.println("\n inside the main after calling change() : " + num+"\n");//10 value is not changed eventhough the method is called.
    } 
}

//Pass By Reference :
/* public class PassByVal_VS_PassByRef_Difference {
    public static void change(int arr[]) {
        arr[0] = 1000;
        System.out.println("inside the change() arr[0] : " + arr[0]); // 1000
    }

    public static void main(String[] args) {
        // Pass By Ref
        int arr[] = { 10, 20, 30 };
        System.out.println("Before calling change(),the arr[0] : " + arr[0]);// 10 is a original value
        change(arr);
        System.out.println("After calling change(),the arr[0] : " + arr[0]);// 1000 is a modified value since array is
                                                                            // pass by reference.
    }
}
 */

