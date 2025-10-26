import java.util.Scanner;

public class SwitchCalculatar {
    public static void main(String[] args) {
        System.out.println("Welcome to switch Calculator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Now, Enter Your Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Your Operation: ");
        String sym = input.next();

        switch (sym) {
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                System.out.println(num1 / num2);
            default:
                System.out.println("Invalid Operation");
        }
    }
}

