import java.util.Scanner;

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 6-digit numeric access code: ");
        String code = sc.next();

        System.out.println(isValid(code) ? "Valid Access Code" : "Invalid Access Code");
    }

    public static boolean isValid(String code) {
        // Rule 1: must contain exactly 6 digits
        if (code.length() != 6) {
            return false;
        }
        for (int i = 0; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return false;
            }
        }

        boolean hasEven = false;
        boolean hasOdd = false;
        int sum = 0;

        for (int i = 0; i < code.length(); i++) {
            int digit = code.charAt(i) - '0';
            sum += digit;

            if (digit % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // Rule 2 & 3: at least one even and one odd digit
        if (!hasEven || !hasOdd) {
            return false;
        }

        // Rule 4: sum of digits must be greater than 20
        if (sum <= 20) {
            return false;
        }

        return true;
    }
}