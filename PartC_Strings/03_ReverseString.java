// Program 3: Reverse a string
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Method 1: using StringBuilder
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);

        // Method 2: manual loop (alternative, comment out Method 1 if using this)
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--)
        //     rev += s.charAt(i);
        // System.out.println(rev);

        sc.close();
    }
}
