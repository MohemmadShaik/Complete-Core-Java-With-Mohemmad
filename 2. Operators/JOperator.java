
// 7.1 Arithmetic Operators ---> Binary
public class JOperator {

    public static void main(String[] args) {
        int A = 10;
        int B = 5;
        System.out.println("Addition of "+A+" + "+B+" is "+(A+B)+"\n");
        System.out.println("Subtract of "+A+" - "+B+" is "+(A-B)+"\n");
        System.out.println("Multiply of "+A+" X "+B+" is "+(A*B)+"\n");
        System.out.println("Divide of "+A+" / "+B+" is "+(A/B)+"\n");
        System.out.println("Modulo  of "+A+" % "+B+" is "+(A%B)+"\n");

        System.out.println("========= >> UNARY OPerator << ==============");
    // 7.1 Arithmetic Operator ---> Unary

    //Post increment
    int a = 40;
    System.out.println("Before a++ : "+a); //40
    int b = a++; //Post increment
    System.out.println("After a++ : "+a);//41
    System.out.println("Value of b :"+b);//40

    System.out.println("============>End of Post Increment<===========");

    //Pre increment
    int c = 40;
    System.out.println("Before ++a : "+c); //40
    int d = ++c; //Pre increment
    System.out.println("After ++a : "+c);//41
    System.out.println("Value of b :"+d);//41

    System.out.println("============>End of PRE Increment<===========");

    //Pre decrement
    int e = 65;
    System.out.println("Before ++a : "+e); //65
    int f = --e; //Pre decrement
    System.out.println("After ++a : "+e);//64
    System.out.println("Value of b :"+f);//64

    System.out.println("============>End of Pre decrement<===========");

    //Post decrement
    int e1 = 65;
    System.out.println("Before ++a : "+e1); //65
    int f1 = e1--; //Post decrement
    System.out.println("After ++a : "+e1);//64
    System.out.println("Value of b :"+f1);//65

    System.out.println("============>End of Post decrement<===========");



    }
}



