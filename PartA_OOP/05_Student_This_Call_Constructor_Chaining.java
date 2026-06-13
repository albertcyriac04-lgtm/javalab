// Program 5: this() invoking multiple constructors (constructor chaining)
import java.util.Scanner;

class Student
{
    String name;
    int age;

    Student()
    {
        System.out.println("Default Constructor");
    }

    Student(String name, int age)
    {
        this();                 // this() must be the FIRST statement
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    void display()
    {
        System.out.println("Name : " + name + " Age : " + age);
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String n = sc.next();
        System.out.print("Age: ");
        int a = sc.nextInt();

        Student s = new Student(n, a);
        s.display();

        sc.close();
    }
}
