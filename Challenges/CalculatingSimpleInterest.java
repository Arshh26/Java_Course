import java.util.Scanner;

public class CalculatingSimpleInterest {
    public static void main(String[] args) {
        System.out.println("Calculating The Simple Interest");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your Principle Amount Rs");
        double principle = input.nextDouble();
        System.out.println("Now, Tell me Your Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.println("Now, Tell Me How many Years you are Borrowing The Money: ");
        float time = input.nextFloat();

        double simpleInterest = (principle * time * rate)/100;
        System.out.println("Interest is: "+simpleInterest);

    }
}
