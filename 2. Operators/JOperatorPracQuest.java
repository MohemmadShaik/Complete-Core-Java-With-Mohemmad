// 7.8-Q1 : Guess the output for the below program
  public class JOperatorPracQuest {
    public static void main(String[] args) {
        int x = 2, y =5;
        int exp1 = (x * y / x ); //5
        int exp2 = (x * (y / x) ); //4

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    
       /* output is (5 , 4) */
        
    }
}
