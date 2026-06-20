// Program 19: Static method converting Celsius to Fahrenheit
import java.util.Scanner;

class Convert
{
    static double toFahrenheit(double c)
    {
        return (c * 9 / 5) + 32;
    }
}

class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit = " + Convert.toFahrenheit(c));

        sc.close();
    }
}
