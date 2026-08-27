import java.util.Scanner;

class LowAttendanceException extends Exception {
    public LowAttendanceException(String message) {
        super(message);
    }
}

public class LowAttendanceExceptionDemo {
    public static void checkAttendance(double percentage) throws LowAttendanceException {
        if (percentage < 75.0) {
            throw new LowAttendanceException("Attendance is below 75%. Student is not eligible for exam.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        try {
            double attendance = scanner.nextDouble();
            checkAttendance(attendance);
            System.out.println("Attendance verified. Eligible for exam.");
        } catch (LowAttendanceException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid percentage value.");
        } finally {
            scanner.close();
        }
    }
}
