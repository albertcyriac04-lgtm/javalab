import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a=");
        int a = scanner.nextInt();
        
        System.out.print("b=");
        int b = scanner.nextInt();
        
        System.out.print("c=");
        int c = scanner.nextInt();
        
        System.out.print("d=");
        int d = scanner.nextInt();
        
        System.out.print("e=");
        int e = scanner.nextInt();
        
        // Evaluated as: a + (b * c) - (d / e)
        // 10 + (5 * 2) - (8 / 4) = 10 + 10 - 2 = 18
        int result = a + b * c - d / e;
        
        System.out.println("Result = " + result);
        
        scanner.close();
    }
}
