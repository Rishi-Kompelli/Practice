import java.util.Scanner;
import java.util.Random;

public class Main {
    private static int numberToGuess;
    private static int attempts;
    private static int maxNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Guess the Number Game!");
            System.out.println("Choose a difficulty level:");
            System.out.println("1. Easy (1-10)");
            System.out.println("2. Medium (1-50)");
            System.out.println("3. Hard (1-100)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    startGame(10);
                    break;
                case 2:
                    startGame(50);
                    break;
                case 3:
                    startGame(100);
                    break;
                case 4:
                    System.out.println("Thanks for playing! Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void startGame(int range) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        numberToGuess = random.nextInt(range) + 1;
        maxNumber = range;
        attempts = 0;

        System.out.println("\nI have picked a number between 1 and " + range + ". Can you guess it?");
        boolean isCorrect = false;

        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                isCorrect = true;
                System.out.println("You guessed the number! " + numberToGuess +
                                   " in " + attempts + " attempts!");
                calculateScore();
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
        scanner.close();
    }

    public static void calculateScore() {
        int score = (int) (1000 / (attempts * (maxNumber / 10.0)));
        System.out.println("Your score: " + score);
    }
}
