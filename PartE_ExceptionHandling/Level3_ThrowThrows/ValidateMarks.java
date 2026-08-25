import java.util.Scanner;

public class ValidateMarks {
    public static void checkMarks(double marks) throws IllegalArgumentException {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        try {
            double marks = scanner.nextDouble();
            checkMarks(marks);
            System.out.println("Valid marks entered: " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid numeric input.");
        } finally {
            scanner.close();
        }
    }
}
