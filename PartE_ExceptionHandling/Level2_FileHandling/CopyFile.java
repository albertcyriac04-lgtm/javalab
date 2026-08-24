import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String sourceFile = inputScanner.nextLine();
        System.out.print("Enter destination file name: ");
        String destFile = inputScanner.nextLine();

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destFile)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            System.out.println("File contents copied successfully to " + destFile);
        } catch (IOException e) {
            System.out.println("File copy error: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
