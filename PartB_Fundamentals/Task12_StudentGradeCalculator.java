// Task 12: Student grade calculator based on marks
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks = ");
        int marks = sc.nextInt();

        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else grade = 'D';

        System.out.println("Grade = " + grade);

        sc.close();
    }
}
