package Enums;

public class DayTwoTest {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        for (DayTwo dayTwo : DayTwo.values()) {
            System.out.printf("%s : %s\n", dayTwo, dayTwo.getType());
        }
    }
}
