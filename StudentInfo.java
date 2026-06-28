import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        System.out.print("Course: ");
        String course = scanner.nextLine();
        
        System.out.print("Percentage: ");
        double percentage = scanner.nextDouble();
        
        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.printf("%-10s : %s\n", "Name", name);
        System.out.printf("%-10s : %d\n", "Roll No", rollNo);
        System.out.printf("%-10s : %s\n", "Course", course);
        System.out.printf("%-10s : %.1f\n", "Percentage", percentage);
        
        scanner.close();
    }
}
