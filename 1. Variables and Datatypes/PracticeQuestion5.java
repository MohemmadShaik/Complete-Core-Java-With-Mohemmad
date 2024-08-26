/* Q5 : (Advanced) Will the following statement give any error in Java
      
            int $ = 24;
    
    Note : Valid Characters or identifiers in Java Variable Names:
    ===============================================
       Letters: Uppercase (A-Z) and lowercase (a-z).
       Digits: (0-9), but a variable name cannot start with a digit.
       Special Symbols: The underscore (_) and the dollar sign ($) are allowed.
 */
public class PracticeQuestion5 {
    public static void main(String[] args) {
        int $ = 24;
        System.out.println("Now $ value is : "+$);

        int _a = 67;
        System.out.println("Now _ value is: "+_a);

        /* int @ = 98;
        System.out.println("Now @ value is : "+@);

     Note : Here '@' Symbol: In Java, @ is used as a prefix for annotations (e.g., @Override, @Deprecated). Since it has a specific purpose, it cannot be used as a variable name.
     Reserved Symbols: Symbols like #, @, !, &, etc., are reserved for specific purposes in programming languages and cannot be used as part of variable names.
     Identifiers in Java: Valid identifiers in Java can only contain letters (A-Z, a-z), digits (0-9), underscores (_), and dollar signs ($). 
                           They must start with a letter, an underscore, or a dollar sign.

        */


    }
    
}
