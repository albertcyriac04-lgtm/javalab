import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadUntilValidFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        File file = null;
        
        while (true) {
            System.out.print("Enter a valid file name: ");
            String fileName = inputScanner.nextLine();
            file = new File(fileName);
            if (file.exists() && file.isFile()) {
                break;
            }
            System.out.println("File does not exist. Please try again.");
        }

        System.out.println("\n--- First 5 Lines of " + file.getName() + " ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null && count < 5) {
                System.out.println(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
