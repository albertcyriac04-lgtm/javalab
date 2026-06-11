// Program 2: Parameterized constructor - Employee name and salary
import java.util.Scanner;

class Employee
{
    String name;
    double salary;

    Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    void display()
    {
        System.out.println("Employee Name : " + name + " Employee Salary : " + salary);
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String n = sc.next();
        System.out.print("Salary: ");
        double s = sc.nextDouble();

        Employee e = new Employee(n, s);
        e.display();

        sc.close();
    }
}
