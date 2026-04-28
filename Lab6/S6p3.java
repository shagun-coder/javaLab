class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("count is : " + i);
            try {
                System.out.println("Before sleep.... " );
                Thread.sleep(1000); 
                System.out.println("After sleep.... ");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class S6p3 {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
      

        t1.start();
      

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread -> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}