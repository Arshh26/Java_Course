import java.util.Scanner;

    public class TwoNumbersOfBitwiseOr {
        public static void main(String[] args) {
            System.out.println("Bitwise And Operator..\n");
            Scanner input = new Scanner(System.in);
            System.out.print("Please, Enter First Number: ");
            int firstNum = input.nextInt();
            System.out.print("Now, Enter Your Second Number: ");
            int secondNum = input.nextInt();

            int result = firstNum | secondNum;
            System.out.println("Result is: " + result);
        }
    }

