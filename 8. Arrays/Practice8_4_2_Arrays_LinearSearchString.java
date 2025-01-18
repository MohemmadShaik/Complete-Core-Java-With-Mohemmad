//Practice 4.2 : Linear Search for given array of string values.
//LinearSearch : Finding the index value of an array which contains string .
public class Practice8_4_2_Arrays_LinearSearchString {
    public static int linearSearchString(String items[], String key) {
        for (int i = 0; i < items.length; i++) {
            //if (items[i] == key) {
            if(items[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String items[] = { "Dosa", "Poori", "Vada Pav", "Idly", "Uttapam" };
        String key = "Poori";

        int index = linearSearchString(items, key);
        if (index == -1) {
            System.out.println("\nItem not found.");
        } else {
            System.out.println("\nItem found at index : " + index);
        }
        System.out.println("\n");
    }
}
