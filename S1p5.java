/*5. Find the Maximum and Minimum Elements in a List 
Problem: 
• Given a List<Integer>, find and print the maximum and minimum values. 
Hint: Use Collections.max() and Collections.min(). */
import java.util.ArrayList;
import java.util.Collections;
public class S1p5 {
    public static void main(String[] args){
         ArrayList<Integer> Nums = new ArrayList<>();
         Nums.add(10);
            Nums.add(5);
            Nums.add(20);
            Nums.add(3);
            Nums.add(15);
             System.out.println("maximum :"+Collections.max(Nums));
             System.out.println("minimum :" + Collections.min(Nums));

    }
            
}
