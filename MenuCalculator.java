import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        
        System.out.print("A=");
        double a = scanner.nextDouble();
        
        System.out.print("B=");
        double b = scanner.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid Choice!");
                valid = false;
                break;
        }
        
        if (valid) {
            if (result == (long) result) {
                System.out.println("Result = " + (long) result);
            } else {
                System.out.println("Result = " + result);
            }
        }
        
        scanner.close();
    }
}
