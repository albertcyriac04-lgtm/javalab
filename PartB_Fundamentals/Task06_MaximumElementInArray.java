// Task 6: Find maximum element in an array
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

        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];

        System.out.println("Largest element = " + max);

        sc.close();
    }
}
