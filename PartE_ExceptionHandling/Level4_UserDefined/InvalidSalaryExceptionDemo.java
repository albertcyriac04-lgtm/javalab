import java.util.Scanner;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

public class InvalidSalaryExceptionDemo {
    public static void checkSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be less than zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        try {
            double salary = scanner.nextDouble();
            checkSalary(salary);
            System.out.println("Salary recorded: $" + salary);
        } catch (InvalidSalaryException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid numeric salary input.");
        } finally {
            scanner.close();
        }
    }
}
