import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array:");
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.trim().split("\\s+");
            int positiveCount = 0;
            int negativeCount = 0;
            int zeroCount = 0;
            
            for (String token : tokens) {
                if (token.isEmpty()) continue;
                try {
                    int val = Integer.parseInt(token);
                    if (val > 0) {
                        positiveCount++;
                    } else if (val < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                } catch (NumberFormatException e) {
                    // Ignore invalid formats
                }
            }
            
            System.out.println("\nPositive numbers = " + positiveCount);
            System.out.println("Negative numbers = " + negativeCount);
            System.out.println("Zeros = " + zeroCount);
        }
        scanner.close();
    }
}
