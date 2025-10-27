import java.util.Scanner;

public class MultiplicationTableForLoop {
    public static void main(String[] args) {
        System.out.println("Multiplication table using for loop \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want multiplcation table: ");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
