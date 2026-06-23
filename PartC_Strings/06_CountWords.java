// Program 6: Count the number of words in a sentence
import java.util.Scanner;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String words[] = s.trim().split("\\s+");   // handles extra spaces too

        System.out.println(words.length);

        sc.close();
    }
}
