import java.sql.SQLOutput;
import java.util.Scanner;

public class FahreniteToCelsius {
    public static void main(String[] args) {
        System.out.println("FahreniteToCelsius...");
        Scanner input = new Scanner(System.in);
        System.out.print("Please, Enter Today's Fahrenite value: ");
        float fah = input.nextFloat();

        double celsius = (fah - 32) * 5 / 9;
        System.out.println("Today's celsius is: "+celsius);
    }
}
