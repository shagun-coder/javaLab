/*
 * Sort a List in Ascending and Descending Order
 * Problem:
 * • Given a List<Integer>, sort it in both ascending and descending order.
 * Hint: Use Collections.sort() and Collections.reverseOrder().
 */
import java.util.*;
public class S1p7 {
    public  static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        System.out.println("Names in the ArrayList: " + list);
        Collections.sort(list);
        System.out.println("sorted List: " + list);


        


    }

}
