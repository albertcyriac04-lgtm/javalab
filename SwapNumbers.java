import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A = ");
        int a = scanner.nextInt();
        
        System.out.print("B = ");
        int b = scanner.nextInt();
        
        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        // 1. Swap using temporary variable
        int originalA = a;
        int originalB = b;
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nAfter Swap (Using Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        // Reset values
        a = originalA;
        b = originalB;
        
        // 2. Swap without temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nAfter Swap (Without Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        scanner.close();
    }
}
