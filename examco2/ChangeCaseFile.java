import java.io.*;
public class ChangeCaseFile {
    public static String changeCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String tempFile = "temp.txt";

        // Try-with-resources automatically closes reader and writer
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

            String line;
            System.out.println("Original File:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String changedLine = changeCase(line);
                writer.println(changedLine);
            }

            // Writer must flush/close before we read the file back
            writer.flush();
            System.out.println("\nData written to temporary file.");

            // Second try-with-resources to read and print the temporary file
            try (BufferedReader tempReader = new BufferedReader(new FileReader(tempFile))) {
                System.out.println("\nTemporary File Contents:");
                while ((line = tempReader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be found. Please create 'input.txt'. Details: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O System Error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nProgram completed.");
        }
    }
}
