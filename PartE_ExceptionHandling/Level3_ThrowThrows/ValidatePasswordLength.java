import java.util.Scanner;

public class ValidatePasswordLength {
    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password length must be at least 8 characters long.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        try {
            String password = scanner.nextLine();
            validatePassword(password);
            System.out.println("Password accepted. Strong password.");
        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
