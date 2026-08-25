import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter file name to create: ");
        String fileName = inputScanner.nextLine();

        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("Notice: File '" + fileName + "' already exists.");
            }
        } catch (IOException e) {
            System.out.println("IOException occurred while creating file: " + e.getMessage());
        } finally {
            inputScanner.close();
        }
    }
}
