
/*
 * 6. Reverse a List
 * Problem:
 * • Given a List<String>, reverse its elements.
 * Hint: Use Collections.reverse().
 */
import java.util.ArrayList;
import java.util.Collections;
public class S1p6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("shagu");
        names.add("ice");
        names.add("bhoomija");
        names.add("sneha");
        System.out.println("Names in the ArrayList: "+ names);
        Collections.reverse(names); 
        System.out.println("Reversed List: " + names);
    }
}