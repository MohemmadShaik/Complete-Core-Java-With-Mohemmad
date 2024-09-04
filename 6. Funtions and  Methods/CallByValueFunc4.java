//11.6.3  call by value Program 3
public class CallByValueFunc4 {
  
    public static void modifyString(String str){
         str="World";
    }
    public static void main(String[] args) {
        String txt="Hello";
        modifyString(txt);
        System.out.println("After modifyString( ) : "+txt);
        
    }
}
