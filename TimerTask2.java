class TimerTask2 implements Runnable {

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {

                System.out.println("Tick");

                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new TimerTask2(), "TimerThread");

        thread.start();

        // Wait for a short time
        Thread.sleep(500);

        // Interrupt the thread
        thread.interrupt();
    }
}