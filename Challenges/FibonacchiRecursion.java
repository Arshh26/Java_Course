import java.util.Scanner;

public class FibonacchiRecursion {
    public static void main(String[] args) {
        System.out.println("This code find the fibonacchi number using recursion \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter your number: ");
        int count = input.nextInt();
        for(int i = 1; i <= count; i++) {
            System.out.println(fibonacchi(i) + " ");
        }
    }
    public static int fibonacchi(int position) {
        if(position == 1) {
            return 0;
        }
        if(position == 2) {
            return 1;
        }
        return fibonacchi(position - 1) + fibonacchi(position - 2);
    }
}
