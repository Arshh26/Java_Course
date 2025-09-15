import java.util.Scanner;

public class FactorialPractice {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Your Answer is: "+fact);

    }
    public static void greet(){
        System.out.println("Welcome to Factorial\n");
    }

    public static long factorial(int num){
        if(num <= 2) {
            return 1;
        }
        long fact = 2;
        int i = 3;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
