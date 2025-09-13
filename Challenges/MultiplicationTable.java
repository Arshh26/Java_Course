import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        greet();
        multiplication();

    }
    public static void greet(){
        System.out.println("Welcome to Multiplication Table\n");

    }

    public static int multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Your Number: ");
        int num = input.nextInt();
        System.out.println("Your Multiplication Table.");
        int i = 1;
        while(i<=10){
            int sum = num*i;
            System.out.println(num + "x" + i + "=" + sum );
            i++;
        }
        return num;
    }
}
