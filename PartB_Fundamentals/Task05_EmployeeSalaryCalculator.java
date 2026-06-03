// Task 5: Employee salary calculator - DA, HRA, Gross Salary
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        double basic = sc.nextDouble();

        double da = 0.10 * basic;
        double hra = 0.15 * basic;
        double gross = basic + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + gross);

        sc.close();
    }
}
