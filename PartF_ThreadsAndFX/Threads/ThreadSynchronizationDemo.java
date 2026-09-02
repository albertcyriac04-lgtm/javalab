// Program demonstrating Producer-Consumer Problem using Thread Synchronization (wait and notify)

class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // Wait until buffer is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = value;
        this.hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer thread
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer thread
        return data;
    }
}

class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i * 10);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }
    }
}

class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }
    }
}

public class ThreadSynchronizationDemo {
    public static void main(String[] args) {
        System.out.println("--- Thread Synchronization (Producer-Consumer) Demo ---");
        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Synchronization demo completed successfully.");
    }
}
