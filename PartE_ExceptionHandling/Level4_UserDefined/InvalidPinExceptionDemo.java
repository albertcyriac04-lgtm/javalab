import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

public class InvalidPinExceptionDemo {
    public static void validatePin(String pin) throws InvalidPinException {
        if (pin == null || !pin.matches("\\d{4}")) {
            throw new InvalidPinException("PIN must be exactly a four-digit number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ATM PIN: ");
        try {
            String pin = scanner.nextLine();
            validatePin(pin);
            System.out.println("PIN accepted. Proceeding to ATM services.");
        } catch (InvalidPinException e) {
            System.out.println("Security Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
