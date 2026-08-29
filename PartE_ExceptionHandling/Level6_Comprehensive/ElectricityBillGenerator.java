import java.util.Scanner;

class NegativeUnitsException extends Exception {
    public NegativeUnitsException(String message) {
        super(message);
    }
}

public class ElectricityBillGenerator {
    public static double calculateBill(double units) throws NegativeUnitsException {
        if (units < 0) {
            throw new NegativeUnitsException("Consumed units cannot be negative.");
        }
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 300) {
            bill = 100 * 1.50 + (units - 100) * 2.50;
        } else {
            bill = 100 * 1.50 + 200 * 2.50 + (units - 300) * 4.00;
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        try {
            double units = scanner.nextDouble();
            double bill = calculateBill(units);
            System.out.println("Total Electricity Bill: $" + bill);
        } catch (NegativeUnitsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid numeric input.");
        } finally {
            scanner.close();
        }
    }
}
