/*
 * 2. Remove an Element from a List
 * Problem:
 * • Given a List<Integer>, remove all occurrences of a specific number.
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 2, 5);
 * int target = 2;
 * System.out.println(removeElement(numbers, target));
 * // Output: [1, 3, 4, 5]
 * Hint: Use removeIf() method.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class S1p2 {
    public static void removeElement(ArrayList<Integer> numbers, int target) {
        numbers.removeIf(num -> num == target);
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5));
        int target = 2;
       removeElement(numbers, target);
        System.out.println("List after removing : " + numbers);
    }
}