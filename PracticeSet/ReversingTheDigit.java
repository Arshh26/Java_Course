import java.util.Scanner;

public class ReversingTheDigit {

    public static void main(String[] args) {
        System.out.println("Welcome to Reversing the digit\n");
        Scanner input =new Scanner(System.in);
        System.out.println("Please, Enter Your Digit here: ");
        int num = input.nextInt();

        int reverse = reversedDigit(num);
        System.out.println("Your reversed number is: "+ reverse);

    }

    public static int reversedDigit(int num) {
        int newNum = 0;
        while(num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;

    }
}
