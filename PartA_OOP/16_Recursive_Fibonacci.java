// Program 16: Recursive nth Fibonacci number
import java.util.Scanner;

class Demo
{
    static int fib(int n)
    {
        if (n == 0) return 0;       // base case 1
        if (n == 1) return 1;       // base case 2
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Number = " + fib(n));

        sc.close();
    }
}
