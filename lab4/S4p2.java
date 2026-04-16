/*Q2. Banking App – Limited Access 
Design a BankAccount system: 
• balance should be hidden.  
• A method withdraw() should only be accessible inside the package.  
• A method checkBalance() should be publicly accessible.  
• A subclass PremiumAccount (in different package) should still be able to access 
some inherited data.  
Use private, protected, default, public properly */


class BankAccount{
    private int amount;
    private int Balance;
    
    BankAccount(){
        Balance = 1000;
    }
    public void checkBalance(){
        System.out.println("Current Balance: "+Balance);
    }
    void withdraw(int amount){
        if(amount <= Balance){
            Balance -= amount;
            System.out.println("Amount withdrawn: "+amount);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}

class PremiumAccount extends BankAccount{
    void accessWithdraw(int amount){
        withdraw(amount);
    }
}
public class S4p2 {
    public static void main(String[] args) {
        PremiumAccount pa = new PremiumAccount();
        pa.checkBalance();
        pa.accessWithdraw(100);
        pa.checkBalance();
    }

    
}
