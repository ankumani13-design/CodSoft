import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int lower = 1, upper = 100, maxAttempts = 5, score = 0;

        while (true) {
            int numberToGuess = rand.nextInt(upper- lower + 1) + lower;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("\nGuess the number between 1 and 100");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed it in " + attempts + " attempts.");
                    guessed = true;
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low! Poor guess ,try again");
                } else {
                    System.out.println("Too high! try again");
                }
            }

            if (!guessed) {
                System.out.println("Opps! Out of attempts\n The number was: " + numberToGuess);
            }

            System.out.println("Your total score: " + score);
            System.out.print("Play again? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) break;
        }
    }
}
