// Task 16: Check whether a number is prime
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num < 2)
            isPrime = false;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");

        sc.close();
    }
}
