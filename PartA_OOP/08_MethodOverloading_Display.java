// Program 8: Overload display() for int, double, String
import java.util.Scanner;

class Overload
{
    void display(int i)
    {
        System.out.println("Integer : " + i);
    }

    void display(double d)
    {
        System.out.println("Double : " + d);
    }

    void display(String s)
    {
        System.out.println("String : " + s);
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Integer: ");
        int i = sc.nextInt();
        System.out.print("Double: ");
        double d = sc.nextDouble();
        System.out.print("String: ");
        String s = sc.next();

        Overload o = new Overload();
        o.display(i);
        o.display(d);
        o.display(s);

        sc.close();
    }
}
