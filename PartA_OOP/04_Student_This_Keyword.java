// Program 4: 'this' keyword to distinguish local/parameter variables from instance variables
import java.util.Scanner;

class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;   // this.name -> instance variable, name -> parameter
        this.age = age;
    }

    void display()
    {
        System.out.println("Student Name : " + this.name + " Age : " + this.age);
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
