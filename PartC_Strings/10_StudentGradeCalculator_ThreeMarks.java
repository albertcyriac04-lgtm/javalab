// Program 10: Student name + 3 marks -> average and grade
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;

        char grade;
        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else grade = 'D';

        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
