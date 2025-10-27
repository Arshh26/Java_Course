import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to Recursion \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("Your Factorial value is: "+ result);

    }

    public static int factorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
