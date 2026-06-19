// Program 17: Private data members accessed via public getters and setters
import java.util.Scanner;

class Student
{
    private String name;
    private int age;

    public void setName(String n) { name = n; }
    public void setAge(int a)     { age = a; }

    public String getName() { return name; }
    public int getAge()     { return age; }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Name: ");
        s.setName(sc.next());
        System.out.print("Age: ");
        s.setAge(sc.nextInt());

        System.out.println("Student Name : " + s.getName() + " Age : " + s.getAge());

        sc.close();
    }
}
