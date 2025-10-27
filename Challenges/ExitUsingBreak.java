import java.util.Scanner;

public class ExitUsingBreak {
    public static void main(String[] args) {
        System.out.println("Break Statement \n");
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("please, Enter your command: ");
            String command = input.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You've Successfully exited");
    }
}
