import java.util.Scanner;

public class ValidateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        try {
            int age = scanner.nextInt();
            if (age < 18) {
                throw new IllegalArgumentException("Age must be 18 or above to proceed.");
            }
            System.out.println("Age validated successfully. Access granted.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input provided.");
        } finally {
            scanner.close();
        }
    }
}
