import java.util.Scanner;

public class ReverseTheDigits {

    public static void main (String[] args) {
        System.out.println("Welcome to revering the digit");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("Your reversed number is: "+ reverse);
    }

    public static int reverse (int num) {
        int newNum = 0;
        while(num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}