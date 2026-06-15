// Program 10: Pass object to a method that displays student details
import java.util.Scanner;

class Student
{
    String name;
    int rollNo;

    Student(String n, int r)
    {
        name = n;
        rollNo = r;
    }
}

class Demo
{
    static void showDetails(Student s)
    {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.rollNo);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String n = sc.next();
        System.out.print("Roll No: ");
        int r = sc.nextInt();

        Student s = new Student(n, r);
        showDetails(s);

        sc.close();
    }
}
