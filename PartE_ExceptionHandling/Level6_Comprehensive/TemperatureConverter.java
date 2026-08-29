import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Select choice (1 or 2): ");

        try {
            int choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice selection.");
                return;
            }

            System.out.print("Enter temperature value: ");
            double temp = scanner.nextDouble();

            if (choice == 1) {
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println(temp + "°C = " + fahrenheit + "°F");
            } else {
                double celsius = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F = " + celsius + "°C");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Temperature and menu options must be numeric values.");
        } finally {
            scanner.close();
        }
    }
}
