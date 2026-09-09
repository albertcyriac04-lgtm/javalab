import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter interger number   :");

        int n=input.nextInt();
        int sumofEven=0;
        int countOdd=0;
        int maxFive=0;
        for (int i =1;i<=n;i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                sumofEven += i;
            } else {
                countOdd += 1;
            }
            if (i % 5 == 0) {
                maxFive = i;
            }
        }
        System.out.println("");
        System.out.println("sum of even "+sumofEven);
        System.out.println("number of odd "+countOdd);
        System.out.println("maximum of five "+maxFive);


    }
}
