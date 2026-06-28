import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("N = ");
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        if (n > 0) {
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Largest element = " + max);
        } else {
            System.out.println("Array is empty");
        }
        
        scanner.close();
    }
}
