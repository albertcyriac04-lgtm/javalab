import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountLinesInFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = inputScanner.nextLine();

        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Total lines in file: " + lineCount);
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
