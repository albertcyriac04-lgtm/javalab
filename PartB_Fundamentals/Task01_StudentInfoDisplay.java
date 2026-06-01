// Task 1: Student Information Display
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Roll No: ");
        int roll = sc.nextInt();
        System.out.print("Course: ");
        String course = sc.next();
        System.out.print("Percentage: ");
        double percent = sc.nextDouble();

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percent);

        sc.close();
    }
}
