import java.util.Scanner;

class InvalidOverdueDaysException extends Exception {
    public InvalidOverdueDaysException(String message) {
        super(message);
    }
}

public class LibraryFineCalculator {
    public static double calculateFine(int days) throws InvalidOverdueDaysException {
        if (days < 0) {
            throw new InvalidOverdueDaysException("Overdue days cannot be negative.");
        }
        if (days == 0) return 0;
        if (days <= 5) return days * 1.0;
        if (days <= 10) return 5 * 1.0 + (days - 5) * 2.0;
        return 5 * 1.0 + 5 * 2.0 + (days - 10) * 5.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of overdue days: ");
        try {
            int days = scanner.nextInt();
            double fine = calculateFine(days);
            System.out.println("Total library fine: $" + fine);
        } catch (InvalidOverdueDaysException e) {
            System.out.println("Invalid Input Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid integer input.");
        } finally {
            scanner.close();
        }
    }
}
