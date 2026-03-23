/*
 * 6. Hospital Management
 * Create class Person with name and age.
 * Create subclass Patient with disease and doctorAssigned.
 * Display complete patient information.
 */
class Person{
    String name;
    int age;
    Person(String n,int a){
        name = n;
        age = a;
    }
   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Patient extends Person{
    String diseases;
    String doctorAssigned;
    Patient(String n,int a,String d, String dc) {
    super(n,a);
    diseases = d;
    doctorAssigned = dc;

}

    void display(){
          System.out.println("Diseases :"+diseases);
        System.out.println("doctorAssigned :"+doctorAssigned);
    }




}

 public class S3p6{
    public static void main(String[] var0) {
        Patient p1 = new Patient("Bhoomij", 13, "beri-beri", "Bhoomija ");
        p1.display();
    }
}
