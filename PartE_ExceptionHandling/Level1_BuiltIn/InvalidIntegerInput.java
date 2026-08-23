import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidIntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int value = scanner.nextInt();
            System.out.println("You entered: " + value);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input is not a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
