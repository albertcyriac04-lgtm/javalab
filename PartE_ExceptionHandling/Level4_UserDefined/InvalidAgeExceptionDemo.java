import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeExceptionDemo {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Registration prohibited.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        try {
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("Age verified successfully.");
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
