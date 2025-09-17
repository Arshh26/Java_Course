import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime Number Checker\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime) {
            System.out.println("Your Number is Prime");
        } else {
            System.out.println("Your Number is not Prime");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

}
