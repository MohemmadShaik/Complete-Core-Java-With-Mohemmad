//Q5 : What is wrong in the following program?

public class JLoopsPQ5 {
    public static void main(String[] args) {

        //int i;
        // for (i=0; i<=5; i++)
        for (int i = 0; i <= 5; i++) { 
            System.out.println(" i =  " + i);
        }
        //System.out.println("i after the loop = " + i); // compilation error since i is used out of the scope
    }
}

/*
  Scope of variable is referred to the part of the program where the variable
  can be used.In this program variable i is declared in the for loop.
  So scope of variablei is limited to the for loop only that is between { and } of the
  for loop. 
  There is a display statement after the for loop where variable i is used
  which means i is used out of scope.This leads to compilation errors.
  The profram given will not run and give an error instead. 
  To correct the program ,the variable i needs to be declared outside the for loop.

 */
