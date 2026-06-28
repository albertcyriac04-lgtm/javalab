import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Rate: ");
        double rate = scanner.nextDouble();
        
        System.out.print("Time: ");
        double time = scanner.nextDouble();
        
        double si = (principal * rate * time) / 100;
        double amount = principal + si;
        
        // Format as integer if it is a whole number to match expected output format, otherwise print double
        if (si == (long) si) {
            System.out.println("Simple Interest = " + (long) si);
        } else {
            System.out.println("Simple Interest = " + si);
        }
        
        if (amount == (long) amount) {
            System.out.println("Amount = " + (long) amount);
        } else {
            System.out.println("Amount = " + amount);
        }
        
        scanner.close();
    }
}
