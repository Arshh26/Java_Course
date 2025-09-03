import java.util.Scanner;

public class Shorthand {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Please Enter The 4 Numbers one by one");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        System.out.println(a += x1);
        int x2 = input.nextInt();
        System.out.println(a += x2);
        int x3 = input.nextInt();
        System.out.println(a += x3);
        int x4 = input.nextInt();
        System.out.println(a += x4);
    }
}
