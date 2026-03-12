/*Student Marks Using Array 
Create a class Student that stores marks of 5 subjects in an array. Use a 
constructor to initialize the array and write a method to calculate the average marks */
class Student {
    int marks[];
    Student() {
        marks = new int[] { 80, 75, 90, 85, 70 };
    }

    void AverageMarks() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double avg = sum / 5.0;
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.AverageMarks();
    }
}