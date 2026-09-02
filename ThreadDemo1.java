// File: ThreadDemo1.java

// Step 1: Create a class that EXTENDS Thread
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {          // Constructor to name each thread
        this.threadName = name;
    }

    @Override
    public void run() {
// Step 2: run() holds the actual task
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(50);            // Pause 500ms so we can SEE the interleaving
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished!");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        // Step 3: Create thread objects
        MyThread thread1 = new MyThread("Thread-Albert");
        MyThread thread2 = new MyThread("Thread-Baluman");

        // Step 4: Start them — start() launches a REAL thread and calls run() on it
        thread1.start();
        thread2.start();

        System.out.println("Main thread continues...");
    }
}
