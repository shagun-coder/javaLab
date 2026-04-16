/* . Secure University Result System 
A university stores student results in a class Result. 
Requirements: 
• Marks should not be directly modified.  
• Only authorized methods can update marks.  
• External classes (like Main) should only be able to view results, not change them.  
• Admin class (in same package) can update marks.  
Design using appropriate access modifiers.  */


class Result{
     private int marks;

    private void setMarks(int m){
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("Invalid marks");
        }
    }
    public int getMarks(){
            return marks;

     }


     
     void upadateMarks(int m){
        setMarks(m);
     }


     class Admin{
        void updateStudentMarks(Result r, int m){
            r.setMarks(m);
        }
     }
}
public class S4p1 {
    public static void main(String[] args) {
        Result r1 = new Result();
        Result.Admin admin = r1.new Admin();
        admin.updateStudentMarks(r1, 85);
        System.out.println("Marks updated by Admin: "+r1.getMarks());
    }
    
}
