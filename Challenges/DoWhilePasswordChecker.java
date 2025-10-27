import java.util.Scanner;

public class DoWhilePasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to password checker \n");
        Scanner input = new Scanner(System.in);

        String password;
        do {
            System.out.println("Please, Enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for entering valid password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }



}
