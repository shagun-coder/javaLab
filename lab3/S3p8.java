/*8. Food Delivery System 
Create class Order with orderId and amount. 
Create subclass OnlineOrder with deliveryCharge. 
     Calculate final bill using super.  */
class Order {
    int orderId;
    double amount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Amount: " + amount);
    }
}

class OnlineOrder extends Order {
    double deliveryCharge;

    OnlineOrder(int orderId, double amount, double deliveryCharge) {
        super(orderId, amount);
        this.deliveryCharge = deliveryCharge;
    }

    double calculateFinalBill() {
        return super.amount + deliveryCharge;
    }

    void displayFinalBill() {
        displayOrder();
        System.out.println("Delivery Charge: " + deliveryCharge);
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}
 public class S3p8 {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder(101, 500.0, 50.0);
        order.displayFinalBill();
    }
}