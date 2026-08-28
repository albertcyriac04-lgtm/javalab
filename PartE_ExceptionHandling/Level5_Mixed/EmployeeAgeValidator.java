import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidEmployeeAgeException extends Exception {
    public InvalidEmployeeAgeException(String message) {
        super(message);
    }
}

public class EmployeeAgeValidator {
    public static void validateAge(int age) throws InvalidEmployeeAgeException {
        if (age < 18 || age > 60) {
            throw new InvalidEmployeeAgeException("Employee age must be between 18 and 60.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Age: ");
            int age = scanner.nextInt();

            validateAge(age);
            System.out.println("Employee " + name + " (Age: " + age + ") is registered successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (InvalidEmployeeAgeException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
