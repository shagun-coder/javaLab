/*5. Thread Priority 
Write a Java program to create three threads with different priorities: 
• Minimum Priority (Thread.MIN_PRIORITY)  
• Normal Priority (Thread.NORM_PRIORITY)  
• Maximum Priority (Thread.MAX_PRIORITY)  
Each thread should display its name and priority value while executing. 
Observe whether priority affects execution order. */
class myThread extends Thread{
    priority
    public void run(){

        Sytem.out.print("MIN PRIORITY :" + Thread.currentName.getName()+" "
                        "NORM PRIORITY : "+ Thread.currentName.getName()+" "
                        "MAX PRIORITY :"+ Thread.currentName.getName()+" "
        );
        try{
            Thread.sleep(500);

        }
        catch(InterupptedException e){
            System.out.print(e);class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name); // set thread name
    }

    public void run() {
        

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " | " + getPriority() + " | " + i);
            try {
                Thread.sleep(200); // small delay so you can see output
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class s6p5 {
    public static void main(String[] args) {
        
        PriorityThread t1 = new PriorityThread("Min ");
        PriorityThread t2 = new PriorityThread("Norm"); 
        PriorityThread t3 = new PriorityThread("Max ");
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10
        
        
        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Main thread info
        System.out.println("Main Thread | Priority-  " + Thread.currentThread().getPriority());

        System.out.println("Name |" + " Priority |" + " Count " );
    }
}
        }
    }
}
public abstract class S6p5 {
    MyThread t1 = new MyThread("MIN_PRIORITY Thread");
        MyThread t2 = new MyThread("NORM_PRIORITY Thread");
        MyThread t3 = new MyThread("MAX_PRIORITY Thread");

        
        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);  
        t1.start();
        t2.start();
        t3.start();
}
