// Task 3: Find and correct errors - Average of three numbers
// Common faults fixed: missing semicolon, wrong variable name, integer division by 3
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b + c) / 3.0;   // 3.0 avoids integer division error

        System.out.println("Average = " + avg);

        sc.close();
    }
}
