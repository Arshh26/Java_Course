import java.util.Scanner;

public class DoWhileNumberGuessing {
    public static void main(String[] args) {
        System.out.println("Number Guessing \n");
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        do{
            System.out.println("Please, Enter your Number from 0 to 10: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("You Guessed a correct Number");
    }
}
