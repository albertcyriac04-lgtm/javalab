import java.util.Scanner;

public class BankWithdrawal {
    public static void withdraw(double balance, double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient balance! Requested withdrawal exceeds available funds.");
        }
        System.out.println("Withdrawal successful! Remaining balance: $" + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter current balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            withdraw(balance, amount);
        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
