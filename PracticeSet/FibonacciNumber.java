import java.util.Scanner;

public class FibonacciNumber{
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Number\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num = input.nextInt();
        fibonacci(num);

    }

    public static void fibonacci(int num){
        if(num < 0)  return;
        System.out.println("0 ");
        if (num == 0) return;
        System.out.println("1 ");

        int first = 0, second = 1;
        while(first + second <= num){
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }


    }

}
