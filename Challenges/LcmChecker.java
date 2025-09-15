import java.util.Scanner;

public class LcmChecker {
    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Your First Number: ");
        int first = input.nextInt();
        System.out.println("Please, Enter Your second Number: ");
        int second = input.nextInt();
        int lcm = calculation(first, second);
        System.out.println("Your Result is: "+lcm);

}
    public static void greet() {
        System.out.println("Welcome to LCM Finder\n");
    }



    public static int calculation(int first, int second){
        int i = 1;
        while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
