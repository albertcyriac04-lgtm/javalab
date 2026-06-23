// Program 5: Check whether a string is a palindrome
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}
