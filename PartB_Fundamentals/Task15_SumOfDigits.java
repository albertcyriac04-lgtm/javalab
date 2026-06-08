// Task 15: Sum of digits of a number using loop
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        int sum = 0;
        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
