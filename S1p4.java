// Convert an Array to a List and Vice Versa 
// Problem: 
// • Convert an Integer[] array into a List<Integer> and back to an array. 
// Hint: Use Arrays.asList() and toArray().
import java.util.ArrayList;

import java.util.Arrays;

public class S1p4{
    public static void main(String[] args) {
       
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array)); // Convert array to list
        System.out.println("List: " + list);

        Integer[] Arraylist = list.toArrayList(new Integer[0]);
        
        
      
    }
}