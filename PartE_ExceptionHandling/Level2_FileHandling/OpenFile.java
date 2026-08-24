import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter file name to open: ");
        String fileName = inputScanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("--- File Contents ---");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' does not exist.");
        } finally {
            inputScanner.close();
        }
    }
}
