
/*
 * Car Details Using this Keyword
 * Create a class Car with attributes brand and price. Use the this keyword
 * inside the
 * constructor to initialize the variables and display the details.
 */
class Car{
    String brand;
    float price;
    
    Car(String b,float p){
        brand = b;
        price = p;
        
    }
   
    Car() {
        this("unknown ",0);
    }
    void display(){
         System.out.println("Brand of car :"+brand);
          System.out.println("price of car :"+ price);
    }
public static void main(String [] args)
 {
    Car c1 = new Car();
 Car c2 = new Car("BMW",100000);
 c1.display();
 c2.display();
}


}