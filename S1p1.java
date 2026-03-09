// 1. Add and Retrieve Elements from an ArrayList 
// Problem: 
// • Create an ArrayList<String>, add five names to it, and print each name using a 
// loop. 
// Hint: Use add() and get() methods of ArrayList.
import java.util.ArrayList;
public class S1p1{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add five names to the ArrayList
        names.add("Alice");
        names.add("Bobe");
        names.add("shaga");   
        names.add("David");
        names.add("Eve");



        // Print each name using a loop
        System.out.println("Names in the ArrayList:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
