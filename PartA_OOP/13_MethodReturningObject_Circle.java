// Program 13: Method returns a Circle object after computing area
import java.util.Scanner;

class Circle
{
    double radius, area;

    Circle(double r)
    {
        radius = r;
        area = 3.14 * r * r;
    }
}

class Demo
{
    static Circle computeCircle(double r)
    {
        return new Circle(r);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        double r = sc.nextDouble();

        Circle c = computeCircle(r);
        System.out.println("Radius = " + c.radius + " Area = " + c.area);

        sc.close();
    }
}
