// Program 15: Recursive sum of first n natural numbers
import java.util.Scanner;

class Demo
{
    static int sum(int n)
    {
        if (n == 0)
            return 0;               // base case
        return n + sum(n - 1);      // recursive case
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));

        sc.close();
    }
}
