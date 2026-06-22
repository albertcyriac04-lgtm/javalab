// Program 4: Count the number of vowels in a string
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        System.out.println(count);

        sc.close();
    }
}
