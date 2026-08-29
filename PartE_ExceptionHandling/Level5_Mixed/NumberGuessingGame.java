import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("--- Welcome to Number Guessing Game ---");
        System.out.println("Guess a number between 1 and 100:");

        while (!guessed) {
            System.out.print("Enter your guess: ");
            try {
                int guess = scanner.nextInt();
                attempts++;
                if (guess == targetNumber) {
                    guessed = true;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number without terminating.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
