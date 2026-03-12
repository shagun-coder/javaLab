class Employee {
    String name;
    String designation;
    double salary;

    Employee(String var1, String var2, double var3) {
        this.name = var1;
        this.designation = var2;
        this.salary = var3;
    }

    void display() {
        System.out.println("Employee name:" + this.name);
        System.out.println("Designation:" + this.designation);
        System.out.println("Salary:" + this.salary);
    }

    public static void main(String[] var0) {
        Employee var1 = new Employee("Rahul", "CEO", (double) 110000.0F);
        var1.display();
    }
}
