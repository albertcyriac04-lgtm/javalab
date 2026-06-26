// Program 11: Check password strength - length>=8, has digit, has uppercase
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String pwd = sc.next();

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (int i = 0; i < pwd.length(); i++)
        {
            if (Character.isDigit(pwd.charAt(i)))
                hasDigit = true;
            if (Character.isUpperCase(pwd.charAt(i)))
                hasUpper = true;
        }

        if (pwd.length() >= 8 && hasDigit && hasUpper)
            System.out.println("Strong");
        else
            System.out.println("Weak");

        sc.close();
    }
}
