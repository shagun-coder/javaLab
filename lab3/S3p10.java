/*
 * 10. Mobile Recharge System
 * Create class Recharge with mobileNumber and planAmount.
 * Create subclass DataRecharge with dataLimit.
 * Show recharge details and benefits.
 */
// Base class
class Recharge {
    protected String mobileNumber;
    protected double planAmount;

 
    public Recharge(String mobileNumber, double planAmount) {
        this.mobileNumber = mobileNumber;
        this.planAmount = planAmount;
    }

    // Method to show details
    public void showDetails() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Plan Amount: " + planAmount);
    }


    public void showBenefits() {
        System.out.println("Basic calling and SMS benefits included.");
    }
}

class DataRecharge extends Recharge {
    private double dataLimit;

    
    public DataRecharge(String mobileNumber, double planAmount, double dataLimit) {
        super(mobileNumber, planAmount);
        this.dataLimit = dataLimit;
    }

   
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Data Limit: " + dataLimit + " GB");
    }

    @Override
    public void showBenefits() {
        System.out.println("Unlimited calls + " + dataLimit + " GB high-speed data.");
    }
}

public class S3p10 {
    public static void main(String[] args) {
        DataRecharge dr = new DataRecharge("9876543210", 199, 1.5);

        System.out.println("Recharge Details:");
        dr.showDetails();

        System.out.println("\nBenefits:");
        dr.showBenefits();
    }
}