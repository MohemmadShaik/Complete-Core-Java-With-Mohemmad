// 7.8-Q3 : Guess the output for the below program

public class JOperatorPQ3 {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y; /* x = x + y // x = 4 */
        y -= z; /* y = y - z // y =0 */
        z /= (x + y); /* z = z / (x + y) // z = 0*/
        System.out.println(x + " " + y + " " + z);

        /* correct output : 4  0  0 */
    }
    
}
