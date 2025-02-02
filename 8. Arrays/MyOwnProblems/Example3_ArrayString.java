//Example 3 : To find the index of element "mango" in an arr[] ={"Apple","Litchi","Banana","Mango"} using linear search.
package MyOwnProblems;

public class Example3_ArrayString {
    public static int arrString(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            /* if (arr[i] == key) {
                return i;
            } */
            if (arr[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String arr[] = { "Apple", "Litchi", "Banana", "Mango" };
        String key = "mango";

        int index = arrString(arr, key);
        if (index != -1) {
            System.out.println("\nKey : " + key + " index found at : " + index + "\n");
        } else {
            System.out.println("\n"+key + " is not exists in the arr[].\n");
        }
    }
}
