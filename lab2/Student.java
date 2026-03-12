/*
 * . Student Details
 * Create a class Student with data members name and rollNo. Use a constructor
 * to
 * initialize them and display the student details.
 */

class Student{
    String name;
    int rollNo;


    Student(String n,int r){
        name =n;
        rollNo =r;

    }
    void display(){
        System.out.println("Student Name:"+name);
        System.out.println("Roll no :"+rollNo);

    }
    public static void main(String [] args){
        Student s1 = new Student("Rahul",101);
        s1.display();
    }

}