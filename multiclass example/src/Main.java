
class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(15, 25);
        int product = calc.multiply(6, 7);
        System.out.println("--- Simple Multi-Class Execution ---");
        System.out.println("Addition Result (15 + 25)      : " + sum);
        System.out.println("Multiplication Result (6 * 7)  : " + product);
    }
}