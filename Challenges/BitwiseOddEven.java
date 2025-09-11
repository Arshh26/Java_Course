import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        System.out.println("Bitwise Odd Even Finder");
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter The Number: ");
        int num = input.nextInt();

        if ((num & 1 )== 1){
            System.out.println("Your Number is odd");
        } else {
            System.out.println("Your Number is even");
        }
    }
}
