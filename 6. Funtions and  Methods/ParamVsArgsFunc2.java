//11.4 Parameter VS Arguments
// Print sum of two numbers using functions
public class ParamVsArgsFunc2 {
 public static int calculateSum(int x, int y){ // Here int x, int y are called parameters or formal parameters
    int sum = x + y;
    return sum;
 }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      int sum =  calculateSum(a,b); // Arguments (or) Actual Parameters
      System.out.println("sum of "+a+" and "+b+" is "+sum);
    }
}
