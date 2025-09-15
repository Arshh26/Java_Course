import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the Number: ");
        int num = input.nextInt();
        int sum = addition(num);
        System.out.println("Your Answer is: "+sum);
    }

    public static void greet() {
        System.out.println("Sum of all the digits\n");

    }

    public static int addition(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
