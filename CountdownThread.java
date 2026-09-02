class CountdownThread extends Thread {

    public CountdownThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println(getName() + " - Countdown: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }

    public static void main(String[] args) {

        CountdownThread t1 = new CountdownThread("Thread-1");
        CountdownThread t2 = new CountdownThread("Thread-2");

        t1.start();
        t2.start();
    }
}