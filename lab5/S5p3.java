// take input from the user and convert it to an integer.Handle invalid(non-numeric)input.Concepts:NumberFormatException


import java.util.Scanner;
public class S5p3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    try{
          System.out.print("Enter String :");
        String str = sc.nextLine();
        int a = Integer.parseInt(str);

    }
    catch(NumberFormatException e){
        System.out.print("Invalid input");
    }
}
}
