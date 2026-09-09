
class Calculator {
    public int add(int a, int b) {
        System.out.println("Executing: add(int, int)");
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("Executing: add(int, int, int)");
        return a + b + c;
    }
    public double add(double a, double b) {
        System.out.println("Executing: add(double, double)");
        return a + b;
    }
    public String add(String a, String b) {
        System.out.println("Executing: add(String, String)");
        return a + b;
    }

}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();


        int sum1 = calc.add(10, 20);
        System.out.println("Result: " + sum1 + "\n");

        int sum2 = calc.add(10, 20, 30);
        System.out.println("Result: " + sum2 + "\n");

        double sum3 = calc.add(15.5, 24.5);

        System.out.println("Result: " + sum3 + "\n");
        String combinedStr = calc.add("Albert  ", "Cyriac");
        System.out.println("Result: " + combinedStr + "\n");
    }

}