import java.util.Scanner;

public class SumOfDigitsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Number: ");
        int num = input.nextInt();
        int sum = addition(num);
        System.out.println("Your sum is: "+sum);

    }

    public static void greet() {
        System.out.println("Welcome to Sum of digits\n");
    }

    public static int addition(int num){
        int sum = 0;
        while(num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
