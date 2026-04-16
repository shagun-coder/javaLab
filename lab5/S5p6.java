/*. Using finally Block 
Write a program that demonstrates that finally always executes, even if an exception occurs. 
Concepts: finally behavior  */
public class S5p6 {
    
import java.util.Scanner;

public class S5p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num:");
        int a = sc.nextInt();
        System.out.print("Enter deno:");
        int b = sc.nextInt();

        try {

            int res = a / b;
            System.out.print("Result :" + res);
        } catch (ArithmeticException e) {
            System.out.print("b can not be zero");
        }
        finally {
            System.out.print("This will always execute");
        }

    }
}
    
}
