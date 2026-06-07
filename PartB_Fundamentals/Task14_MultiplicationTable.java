// Task 14: Display multiplication table of a number
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));

        sc.close();
    }
}
