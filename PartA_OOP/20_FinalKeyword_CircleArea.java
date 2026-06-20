// Program 20: final keyword - constant PI, area of circle
import java.util.Scanner;

class Circle
{
    final double PI = 3.14;      // cannot be changed once assigned

    double area(double r)
    {
        return PI * r * r;
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle();
        System.out.println("Area = " + c.area(r));

        sc.close();
    }
}
