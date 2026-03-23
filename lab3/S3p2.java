/*
 * 2. Employee Salary System
 * Create a class Employee with name and baseSalary.
 * Create subclass Manager with bonus.
 * Calculate total salary using inherited data.
 */

class Employee{
    String name;
    float baseSalary;
    Employee(String n,float bs){
        name= n;
        baseSalary = bs;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("BaseSalary "+baseSalary);

    }


}

class Manager extends Employee {
    double bonus;

    Manager(String n, int bs , int b) {
        super(n,b); // calling parent constructor
       bonus = b;
    }

    double calculateTotalSalary() {
    return baseSalary + bonus;
    }

    void display() {
        super.display();
        System.out.println("Bonus:" +bonus);
        System.out.println("Total Salary:"+ calculateTotalSalary());
    }

   
}
public class S3p2{
public static void main(String[] args) {
Manager m1 = new Manager("Amit", 50000, 10000);
m1.display();
}}