// 3. Check if a List Contains a Specific Element 
// Problem: 
// • Given a List<String>, check if a specific string is present. 
// Hint: Use the contains() method of List.
import java.util.ArrayList;
public class S1p3{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("shagu");
        names.add("ice");
        names.add("bhoomija");
        names.add("sneha");
        System.out.println("Names in the ArrayList: "+ names);
        String target = "ice";
        if (names.contains(target)) {
            System.out.println(target +" is present in the list.");
        } else {
            System.out.println(target +" is not present in the list.");
        }
    }
}
