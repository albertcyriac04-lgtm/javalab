import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Corrected Errors in the original faulty code:
        // 1. Fixed missing semicolon at the end of variable declarations.
        // 2. Fixed wrong variable name (e.g., using 'num1', 'num2', 'num3' instead of undeclared or mismatched variables in summation).
        // 3. Prevented division by zero by validating that 'count' is non-zero before computing the average.
        
        int count = 3;
        
        // Read 3 integers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        double sum = num1 + num2 + num3;
        double average = 0.0;
        
        if (count != 0) {
            average = sum / count;
        } else {
            System.out.println("Error: Division by zero");
        }
        
        System.out.println("Average = " + average);
        
        scanner.close();
    }
}
