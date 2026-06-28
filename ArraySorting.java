import java.util.Scanner;
import java.util.ArrayList;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Array:");
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.trim().split("\\s+");
            
            ArrayList<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                if (token.isEmpty()) continue;
                try {
                    list.add(Integer.parseInt(token));
                } catch (NumberFormatException e) {
                    // Ignore invalid formats
                }
            }
            
            int n = list.size();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = list.get(i);
            }
            
            // Bubble Sort in ascending order
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            
            System.out.println("Sorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i < n - 1 ? " " : ""));
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
