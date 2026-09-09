import java.util.Scanner;

public class AttendanceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attendedClasses = sc.nextInt();

        double percentage =
                ((double) attendedClasses / totalClasses) * 100;

        System.out.printf("Attendance = %.2f%%%n", percentage);

        sc.close();
    }
}