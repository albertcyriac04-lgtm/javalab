// Task 19: Read numbers into an array and sort in ascending order (Bubble Sort)
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

        // Bubble sort
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        sc.close();
    }
}
