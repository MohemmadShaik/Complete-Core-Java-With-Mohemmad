/* Practice3.2 (a):- Here two arguments is passed in update
                   (i.e update(int marks[], int nonChangable))
                    to know the differnce b/w primitive type 
                    and array type. 
               (b):- Here we also seen how to update the 
                     array elements directly without using
                     any method.
*/
public class Practice8_3_2_Arrays_Functions_As_Arguments {
    public static void update(int marks[], int nonChangable){
        nonChangable = 49;
        for(int i=0; i<marks.length;i++){
            marks[i] = marks[i]+10; 
        }
    }
    public static void main(String[] args) {
        int marks[] = {85,75,90};
        int nonChangable = 50;
        update(marks,nonChangable);
        System.out.print("nonChangable value called in main : "+nonChangable);
        System.out.println("\n\nUPDATED MARKS ARE : \n");
        for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        // Without using method
        /* --------------------
        marks[0]= marks[0]+10;
        marks[1]= marks[1]+10;
        marks[2]= marks[2]+10;
        System.out.print("\n\nupdated marks are : "+marks[0]+" "+marks[1]+" "+marks[2]+"\n\n\n"); */
    }
}
