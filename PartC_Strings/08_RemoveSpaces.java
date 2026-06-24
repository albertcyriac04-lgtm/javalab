// Program 8: Remove all spaces from a string
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s.replace(" ", ""));

        sc.close();
    }
}
