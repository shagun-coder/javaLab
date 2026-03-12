/*Array of Objects (Students) 
Create a class Student with attributes name and marks. Create an array of Student 
objects and display the details of all students.*/
class Students2 {
    String name;
    int marks;

    Students2(String n, int m) {
        name = n;
        marks = m;
    }

    public static void main(String[] args) {
        Students2[] sList = new Students2[3];
        sList[0] = new Students2("Ray", 100);
        sList[1] = new Students2 ("Tampe Imapla", 100);
        sList[2] = new Students2("Harray Styles", 100);
        System.out.println("Detail of the Students");
        for (int i = 0; i < sList.length; i++) {
            System.out.println("Name : "+sList[i].name+" "+"Marks :" + sList[i].marks);
        }

    }
}