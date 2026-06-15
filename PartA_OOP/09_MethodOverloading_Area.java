// Program 9: Overload area() for square and rectangle
import java.util.Scanner;

class Shape
{
    int area(int side)
    {
        return side * side;
    }

    int area(int length, int breadth)
    {
        return length * breadth;
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();

        Shape s = new Shape();
        System.out.println("Area of Square = " + s.area(side));
        System.out.println("Area of Rectangle = " + s.area(l, b));

        sc.close();
    }
}
