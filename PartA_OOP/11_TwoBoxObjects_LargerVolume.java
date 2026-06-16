// Program 11: Pass two Box objects to a method, display larger box by volume
import java.util.Scanner;

class Box
{
    int l, b, h;

    Box(int l, int b, int h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    int volume()
    {
        return l * b * h;
    }
}

class Demo
{
    static void compare(Box b1, Box b2)
    {
        int v1 = b1.volume();
        int v2 = b2.volume();
        int larger = Math.max(v1, v2);
        System.out.println("Larger Box Volume = " + larger);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Box1 (l b h): ");
        Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Box2 (l b h): ");
        Box b2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());

        compare(b1, b2);

        sc.close();
    }
}
