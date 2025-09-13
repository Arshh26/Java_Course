import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        greetUser();

    }

    public static void greetUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Name: ");
        String name = input.next();
        System.out.println("Welcome "+ name+".");
    }
}
