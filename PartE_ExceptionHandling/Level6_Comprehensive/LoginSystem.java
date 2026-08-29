import java.util.Scanner;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

public class LoginSystem {
    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (CORRECT_USERNAME.equals(username) && CORRECT_PASSWORD.equals(password)) {
                System.out.println("Login Successful! Welcome to system.");
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Invalid credentials. Remaining attempts: " + (3 - attempts));
            }
        }

        try {
            if (!loggedIn) {
                throw new LoginFailedException("Account locked! Maximum 3 login attempts exceeded.");
            }
        } catch (LoginFailedException e) {
            System.out.println("Security Alert: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
