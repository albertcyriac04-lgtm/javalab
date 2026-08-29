import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentRecordFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student record file name: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            System.out.println("\n--- Student Details ---");
            while (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length < 2) continue;
                String name = parts[0].trim();
                try {
                    int marks = Integer.parseInt(parts[1].trim());
                    System.out.println("Student: " + name + " | Marks: " + marks);
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Invalid numeric mark for student '" + name + "': " + parts[1]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Student record file not found.");
        } finally {
            scanner.close();
        }
    }
}
