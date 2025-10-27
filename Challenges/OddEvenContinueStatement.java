import java.util.Scanner;

public class OddEvenContinueStatement {
    public static void main(String[] args) {
        System.out.println("This code skips odd numbers and prints even numbers \n");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
