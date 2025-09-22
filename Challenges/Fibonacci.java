import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter The Number: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci series: ");
        fibonacci(num);

    }
    public static void fibonacci(int num) {
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
