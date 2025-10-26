import java.util.Scanner;

public class TernaryOddEven {
    public static void main(String[] args) {
        System.out.println("Finding a Odd or Even Number Using Ternary \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Number: ");
        int num1 = input.nextInt();
        TernaryOddEven ternary = new TernaryOddEven();
        String result = ternary.evenOdd(num1);
        System.out.println(result);


    }
    public String evenOdd(int num1) {
        return (num1 % 2 == 0) ? "Your Number is Even" : "Your Number is Odd";
    }
}
