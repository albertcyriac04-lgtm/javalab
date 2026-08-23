import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[2];
        try {
            System.out.print("Enter first integer: ");
            arr[0] = scanner.nextInt();
            System.out.print("Enter second integer: ");
            arr[1] = scanner.nextInt();

            int divisionResult = arr[0] / arr[1];
            System.out.println("Division result: " + divisionResult);

            System.out.println("Third element of array: " + arr[2]);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid integer input.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
