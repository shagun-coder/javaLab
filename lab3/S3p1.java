/*
 * 1. College Student Record
 * Create a class Person with name and age.
 * Create Student with rollNo and course.
 * Use super() to initialize common details and display full student record.
 */
class Person {
    String name;
    int age;

   Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String n, int a, int r, String c) {
        super(n, a); 
        rollNo = r;
        course = c;
    }

    void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

   
}
public class S3p1{
    public static void main(String[] args ) {
        Student s1 = new Student("Rahul", 20, 101, "BCA");
        s1.display();
    }
}