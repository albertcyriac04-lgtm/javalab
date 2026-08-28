import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentResultValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] marks = new double[5];
        double sum = 0;
        int i = 0;

        System.out.println("Enter marks for 5 subjects:");
        while (i < 5) {
            try {
                System.out.print("Subject " + (i + 1) + ": ");
                double m = scanner.nextDouble();
                if (m < 0 || m > 100) {
                    System.out.println("Marks must be between 0 and 100. Try again.");
                    continue;
                }
                marks[i] = m;
                sum += m;
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric marks.");
                scanner.nextLine();
            }
        }

        double average = sum / 5.0;
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Average Marks: " + average);
        scanner.close();
    }
}
