// Program 7: Convert lowercase letters in a string to uppercase
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s.toUpperCase());

        sc.close();
    }
}
