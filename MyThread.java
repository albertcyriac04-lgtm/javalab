class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Worker: " + i);
        }
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        System.out.println("Main: Before run()");
        t1.run();
        System.out.println("Main: After run()");


        System.out.println();


        MyThread t2 = new MyThread();

        System.out.println("Main: Before start()");
        t2.start();
        System.out.println("Main: After start()");
    }
}