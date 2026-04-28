import java.util.Scanner;

public class S5p1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
         System.out.print("Enter num:");
        int a = sc.nextInt();
        System.out.print("Enter deno:");
        int b = sc.nextInt();
        



        try{

            int res = a/b;
            System.out.print("Result :" + res);
        }
        catch( ArithmeticException e){
            System.out.print("b can not be zero");
        }
        
    }
}