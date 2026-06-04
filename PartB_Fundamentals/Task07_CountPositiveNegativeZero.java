// Task 7: Count positive, negative, and zero values in an array
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > 0) pos++;
            else if (arr[i] < 0) neg++;
            else zero++;
        }

        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Zeros = " + zero);

        sc.close();
    }
}
