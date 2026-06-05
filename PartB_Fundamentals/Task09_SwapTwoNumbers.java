// Task 9: Swap two numbers - with and without a temporary variable
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // --- Without temporary variable (alternative method) ---
        // a = a + b;
        // b = a - b;
        // a = a - b;

        sc.close();
    }
}
