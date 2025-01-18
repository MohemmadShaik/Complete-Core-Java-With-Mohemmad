//Practice 3.1 : Here only one argument is passed in update method (i.e update(int marks[])).
public class Practice8_3_1_Arrays_Functions_As_Arguments {
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i]+10;
        }
    }
    public static void main(String[] args) {
        int marks[] ={86,87,88};
        System.out.print("\nOur original marks : \n");
        System.out.println("--------------------\n");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("\n\nNeed to update each subject marks to 10 \n");
        update(marks);
        System.out.println("To See Our Updated marks : \n");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println("\n");
    }
}
