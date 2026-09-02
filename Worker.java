class Worker implements Runnable {

    private String taskName;
    private int loopCount;

    public Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= loopCount; i++) {

                System.out.println(taskName + " - step " + i);

                Thread.sleep(200);
            }

        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted");
        }
    }

    public static void main(String[] args) {

        Worker w1 = new Worker("Download", 5);
        Worker w2 = new Worker("Upload", 3);
        Worker w3 = new Worker("Processing", 4);

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.start();
        t2.start();
        t3.start();
    }
}