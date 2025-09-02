import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning, " + name);
        System.out.println(name + ", Also Tell Me Your Age");
        int age = input.nextInt();
        System.out.println("You are "+ age + " yrs Old");
    }
}
