/*Write a Java program to demonstrate a race condition where two threads increment the 
same counter variable 1000 times each without synchronization. 
Then modify the program using a synchronized method so that the final counter value is 
always correct */

class Counter {
    int count = 0;

    void increment() {
        count++; 
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count (without synchronization): " + counter.count);
    }
}