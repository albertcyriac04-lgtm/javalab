// Program 3: Constructor overloading - Rectangle (default & parameterized)
import java.util.Scanner;

class Rectangle
{
    int length, breadth;

    Rectangle()                      // default constructor
    {
        length = 1;
        breadth = 1;
    }

    Rectangle(int l, int b)          // parameterized constructor
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return length * breadth;
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());

        sc.close();
    }
}
