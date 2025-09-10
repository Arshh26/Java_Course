import java.util.Scanner;

public class CalculatingCompoundInterest {
    public static void main(String[] args) {
        System.out.println("Calculating The Compound Interest");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Principle Amount Rs");
        double principle = input.nextDouble();
        System.out.println("Now, Tell me Your Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.println("Now, Tell Me How many Years you are Borrowing The Money: ");
        float time = input.nextFloat();

        double compInterest = principle * Math.pow((1+rate/100), time);
        System.out.println("Your Compound Interest is: "+compInterest);
    }
}
