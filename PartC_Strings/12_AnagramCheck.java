// Program 12: Check whether two strings are anagrams
import java.util.Scanner;
import java.util.Arrays;

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}
