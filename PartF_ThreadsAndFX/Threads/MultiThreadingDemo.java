// Program to demonstrate Multi-threading in Java by extending Thread class and implementing Runnable interface

class NumberPrinter extends Thread {
    @Override
    public void run() {
        System.out.println("Thread [NumberPrinter] started execution.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("NumberPrinter Thread - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("NumberPrinter Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread [NumberPrinter] completed.");
    }
}

class MessagePrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable [MessagePrinter] started execution.");
        String[] messages = {"Java", "Multithreading", "Concurrency", "Synchronization", "Threads Complete"};
        for (String msg : messages) {
            System.out.println("MessagePrinter Runnable - Message: " + msg);
            try {
                Thread.sleep(700); // Sleep for 700ms
            } catch (InterruptedException e) {
                System.out.println("MessagePrinter Runnable interrupted: " + e.getMessage());
            }
        }
        System.out.println("Runnable [MessagePrinter] completed.");
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started: " + Thread.currentThread().getName());

        // 1. Thread created by extending Thread class
        NumberPrinter thread1 = new NumberPrinter();

        // 2. Thread created by implementing Runnable interface
        Thread thread2 = new Thread(new MessagePrinter());

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish using join()
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for child threads.");
        }

        System.out.println("Main thread finished execution. All multithreading tasks completed.");
    }
}
