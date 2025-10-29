import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

        /**
         * @param guessNumber the number that player guessed
         * @return
         * - Negative if the guessed number is smaller.
         * - 0 if the guessed number is correct.
         * - Positive if the guessed number is higher.
         */
        int guess(int guessNumber){
            return guessNumber - random;
        }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game guess the number between");
        int guess;
        int result;
        do{
            System.out.println("Guess the number");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0) {
                System.out.println("Your guess is correct");
            } else if (result < 0){
                System.out.println("Please, guess a number higher: ");
            } else {
                System.out.println("Please guess lower");

            }
        } while (result != 0);

    }
}
