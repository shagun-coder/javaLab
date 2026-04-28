class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Name: " + Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class S6p2 {
    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

        // Main thread output
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