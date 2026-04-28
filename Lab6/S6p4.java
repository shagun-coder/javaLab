/* Using join() Method 
Write a Java program to create a child thread that prints numbers from 1 to 5. 
The main thread must wait for the child thread to complete using the join() method before 
printing: 
“Main thread resumes execution.”  */
class  myThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("child thread : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class S6p4 {
    public static void main(String[] args) {

       myThread t1 = new myThread();
        
        t1.start();
 
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread resumes execution.");
    }
}
