import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class SimpleAtmSimulation {
    private static double balance = 1000.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- ATM Simulation ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose option (1-4): ");

            try {
                int option = scanner.nextInt();
                if (option == 4) {
                    System.out.println("Thank you for using ATM.");
                    break;
                }

                switch (option) {
                    case 1:
                        System.out.println("Current Balance: $" + balance);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double dep = scanner.nextDouble();
                        if (dep <= 0) {
                            System.out.println("Deposit amount must be positive.");
                        } else {
                            balance += dep;
                            System.out.println("Deposited successfully. New Balance: $" + balance);
                        }
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double draw = scanner.nextDouble();
                        if (draw > balance) {
                            throw new InsufficientBalanceException("Insufficient Funds! Available balance: $" + balance);
                        }
                        balance -= draw;
                        System.out.println("Withdrawal successful. Remaining balance: $" + balance);
                        break;
                    default:
                        System.out.println("Invalid option! Please enter 1-4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid numeric input.");
                scanner.nextLine();
            } catch (InsufficientBalanceException e) {
                System.out.println("Transaction Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
