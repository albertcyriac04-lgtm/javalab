import java.util.Scanner;

public class UnitPriceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in grams: ");
        int grams = sc.nextInt();

        System.out.print("Enter price per kilogram: ");
        double pricePerKg = sc.nextDouble();

        double kilograms = (double) grams / 1000;
        double totalCost = kilograms * pricePerKg;

        char category;

        if (totalCost > 500)
            category = 'A';
        else
            category = 'B';

        System.out.printf("Weight = %.2f kg%n", kilograms);
        System.out.printf("Total Cost = Rs. %.2f%n", totalCost);
        System.out.println("Category = " + category);

        sc.close();
    }
}