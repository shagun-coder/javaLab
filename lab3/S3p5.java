/*5. Bank Account System 
Create class Account with accNo and balance. 
Create subclass SavingsAccount with interestRate. 
     Use super() and calculate interest. */
class Account {
    int accNo;
    double balance;

    // Constructor
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    
    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance); 
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Total Balance after Interest: " + (balance + interest));
    }
}

// Main class
public class S3p5 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 5);

        sa.display();
        sa.calculateInterest();
    }
}
