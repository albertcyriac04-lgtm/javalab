// Program 12: Method returns a Student object containing name and mark
import java.util.Scanner;

class Student
{
    String name;
    int mark;

    Student(String n, int m)
    {
        name = n;
        mark = m;
    }
}

class Demo
{
    static Student getStudent(String n, int m)
    {
        return new Student(n, m);   // returns reference of newly created object
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String n = sc.next();
        System.out.print("Mark: ");
        int m = sc.nextInt();

        Student s = getStudent(n, m);
        System.out.println("Student Name : " + s.name + " Mark : " + s.mark);

        sc.close();
    }
}
