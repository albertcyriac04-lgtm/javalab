// Task 17: Menu driven calculator using switch statement
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        System.out.print("A = ");
        double a = sc.nextDouble();
        System.out.print("B = ");
        double b = sc.nextDouble();

        double result = 0;
        switch (choice)
        {
            case 1: result = a + b; break;
            case 2: result = a - b; break;
            case 3: result = a * b; break;
            case 4: result = a / b; break;
            default: System.out.println("Invalid choice"); return;
        }

        System.out.println("Result = " + result);

        sc.close();
    }
}
