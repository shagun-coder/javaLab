/*3. Employee Information 
Create a class Employee with attributes name, designation, and salary. Initialize 
them using a constructor and display the employee information.  */
class Employee {
    String name;
    String designation;
    double salary;

    Employee(String n,String d,double s)
    {
        name=n;
        designation=d;
        salary=s;
    }

    void display()
        {
            System.out.println("Employee name:"+name);
            System.out.println("Designation:"+designation);
            System.out.println("Salary:"+salary);
        }
       
   

    
}
public class Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shagun", "Software Engineer", 75000);
        e1.display();
    }
}
