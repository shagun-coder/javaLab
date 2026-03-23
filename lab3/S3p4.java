/*
 * 4. Online Shopping – Product System
 * Create class Product with name and price.
 * Create subclass Electronics with warrantyPeriod.
 * Display product details and final price.
 */

class Product{
    String name;
    float price;
    Product(String n,float p){
        name = n;
        price = p;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("price :"+price);
    }

}
class Electronics extends Product{
    String WarrentyPeroid;
    Electronics(String n,float p,String wr) {
        super(n,p);
        WarrentyPeroid = wr;
    }
    double finalPrice(){
        return price;

    }
    void display(){
        super.display();
       
        System.out.println("wareentyPeriod :" + WarrentyPeroid);

    }
    
    

}
public class S3p4{
    public static void main(String[] args) {
        Electronics m1 = new Electronics("laptop", 100000, "1 year");
        m1.display();
    }
}
