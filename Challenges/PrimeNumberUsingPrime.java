import java.util.Scanner;

public class PrimeNumberUsingPrime {
    public static void main(String[] args) {
        System.out.println("Prime Number Checker \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println((isPrime ? "Your Number is Prime" : "Your Number is not prime"));

    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) ;
        return (num % 2 == 0) ? false : true;
    }
}
