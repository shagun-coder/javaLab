/*2. Exception Handling (Realistic Scenarios) 
Q3. ATM Withdrawal System 
Simulate an ATM: 
• User enters amount.  
• If amount > balance → throw exception.  
• If amount is negative → throw another exception.  
• If input is invalid (non-numeric) → handle properly.  
Use multiple catch blocks + meaningful messages */
import java.util.Scanner;
import java.util.InputMismatchException;




class Atm {
    int amount;
    int balance;


    void withdraw(int a ,int b) throws Exception{
        if(a > balance){
            throw new Exception("Insufficient balance");
        }else if(a < 0){
            throw new Exception("Invalid amount");
        }
        else
            {
            balance -= a;
            System.out.println("Amount withdrawn: "+a);
            System.out.println("Remaining balance: "+balance);
        }
    }

    void setBalance(int b){
        balance = b;
    }

}
class S4p3{
    public static void main(String[] args) {
        
        try {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter amount to withdraw: ");
           int amount = sc.nextInt();
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
        Atm atm = new Atm();
        atm.setBalance(1000);
        try{
            atm.withdraw(1500, 1000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        try
        {
            atm.withdraw(-500, 1000);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}