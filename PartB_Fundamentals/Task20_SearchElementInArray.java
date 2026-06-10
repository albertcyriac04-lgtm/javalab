// Task 20: Search a given element in an array (Linear Search)
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

        System.out.print("Search: ");
        int key = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == key)
            {
                pos = i + 1;   // 1-based position
                break;
            }
        }

        if (pos != -1)
            System.out.println("Element found at position " + pos);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
