/*
 * Bank Account Simulation
 * Create a class BankAccount with attributes accountHolderName and balance. Use
 * a
 * constructor to initialize them and implement a method to deposit money and
 * display the updated balance.
 */
class Bank{
    String accountHolderName;
    float balance;

    Bank(){
        accountHolderName = "unknown";
        balance = 0;

    }
    Bank(String n, int b){
        accountHolderName = n;
        balance = b;

    }
    void  balance(int money){
        balance += money;

    }
    void display(){
        System.out.println("Name :"+accountHolderName);
        System.out.println("Updated balance: "+balance);
    }
    public static void main(String[] args){
        Bank b1 = new Bank("brutus",1000);
        b1.balance(999);
        b1.display();

        
    }

}