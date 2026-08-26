import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int num = scanner.nextInt();
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println("Valid positive number entered: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid integer input.");
        } finally {
            scanner.close();
        }
    }
}
