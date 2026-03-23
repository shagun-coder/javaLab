/*
 * 3. Vehicle Registration System
 * Create class Vehicle with vehicleNo andC.
 * Create subclass Car with model and fuelType.
 * Use constructor chaining to initialize all details.
 */

class Vehicle{
    int v_no;
    String ownerName;
    Vehicle(int v ,String o){
        v_no = v;
         ownerName = o;
        
    }
    void display(){
        System.out.println("vehicle No= "+v_no);
        System.out.println("vehicle No = "+ ownerName);
    }

}
class Car extends Vehicle{
    String model ;
    String fuelType;
    Car(int v ,String o ,String m, String f){
        super(v,o);
    }
    void display(){
        super.display();
        System.out.println("Model :"+model);
        System.out.println("Fuel type:"+fuelType);

    }
    
    

}
public class S3p3{
    public static void main(String[] args) {
        Car m1 = new Car(50000, "Bhoomij", "BMW", "petrol");
        m1.display();
    }
}