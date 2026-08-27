import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class NegativeNumberExceptionDemo {
    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are invalid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = scanner.nextInt();
            checkNumber(num);
            System.out.println("Valid number: " + num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid numeric input.");
        } finally {
            scanner.close();
        }
    }
}
