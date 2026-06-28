import java.util.Scanner;
import java.util.ArrayList;

public class SearchElement {
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
            
            System.out.println("Search:");
            if (scanner.hasNextInt()) {
                int target = scanner.nextInt();
                
                int position = -1;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == target) {
                        position = i + 1; // 1-based position
                        break;
                    }
                }
                
                if (position != -1) {
                    System.out.println("Element found at position " + position);
                } else {
                    System.out.println("Element not found");
                }
            }
        }
        
        scanner.close();
    }
}
