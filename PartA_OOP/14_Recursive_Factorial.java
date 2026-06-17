// Program 14: Recursive factorial
import java.util.Scanner;

class Demo
{
    static int fact(int n)
    {
        if (n == 0 || n == 1)
            return 1;              // base case
        return n * fact(n - 1);    // recursive case
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + fact(n));

        sc.close();
    }
}
