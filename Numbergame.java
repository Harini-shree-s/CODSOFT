import java.util.Random;
import java.util.Scanner;
	
public class Numbergame{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            boolean playGame = true;

            while (playGame) {
                int secretNumber = random.nextInt(100) + 1;
                int attempts = 0;
                System.out.println("______NUMBER GAME_____");
                while (true) {
                    System.out.print("Your guess: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess == secretNumber) {
                        System.out.println("You guessed the number in " + attempts + " attempts.");
                        break;
                    } else if (userGuess < secretNumber) {
                        System.out.println("_____TOO LOW_____");
                    } else {
                        System.out.println("____TOO HIGH ______");
                    }
                }
	
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next().toLowerCase();
                if (!playAgain.equals("yes")) {
                    System.out.println("_____THE END_____");
                    playGame = false;
                }
            }
        }
    }
}