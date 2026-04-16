/*Write a program that: 
• Takes two numbers as input (strings)  
• Converts them to integers  
• Divides them  
Handle: 
• Invalid number input  
• Division by zero  
Concepts: multiple catch blocks 
 */
import  java.util.Scanner;
public class S5p4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
        System.out.print("Enter String 1 :");

        String str1 = sc.nextLine();
        System.out.print("Enter String 2:");
        String str2 = sc.nextLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        int res = a/b;
        system.out.print("division result :"+res);
        }
    
        catch(NumberFormatException e) {
        System.out.print("Invalid input");
        }
      }
       catch(ArithmeticException e) {
         System.out.print("b can not be zero");
      }



    } 
}
    
}
