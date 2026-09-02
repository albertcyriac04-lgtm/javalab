class NumberPrinter implements Runnable {

    private boolean printEven;

    public NumberPrinter(boolean printEven) {
        this.printEven = printEven;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (printEven && i % 2 == 0) {
                System.out.println("Even: " + i);
            }

            if (!printEven && i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {

        NumberPrinter evenPrinter = new NumberPrinter(true);
        NumberPrinter oddPrinter = new NumberPrinter(false);

        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        evenThread.start();
        oddThread.start();
    }
}