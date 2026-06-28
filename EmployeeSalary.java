import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basic Salary: ");
        double basic = scanner.nextDouble();
        
        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double gross = basic + da + hra;
        
        // Output DA
        if (da == (long) da) {
            System.out.println("DA = " + (long) da);
        } else {
            System.out.println("DA = " + da);
        }
        
        // Output HRA
        if (hra == (long) hra) {
            System.out.println("HRA = " + (long) hra);
        } else {
            System.out.println("HRA = " + hra);
        }
        
        // Output Gross Salary
        if (gross == (long) gross) {
            System.out.println("Gross Salary = " + (long) gross);
        } else {
            System.out.println("Gross Salary = " + gross);
        }
        
        scanner.close();
    }
}
