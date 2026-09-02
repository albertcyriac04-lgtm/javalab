// File: ThreadDemo2.java

// Step 1: Create a class that IMPLEMENTS Runnable
class MyRunnable implements Runnable {
    private String taskName;

    public MyRunnable(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
// Step 2: same idea — task code goes here
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(taskName + " - Processing: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
        System.out.println(taskName + " completed!");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        // Step 3: Create the "job" objects
        MyRunnable task1 = new MyRunnable("Task-1");
        MyRunnable task2 = new MyRunnable("Task-2");

        // Step 4: Hand each job to a Thread "worker"
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Step 5: Start them
        thread1.start();
        thread2.start();

        System.out.println("Main thread is free to do other work");
    }
}
