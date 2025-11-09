package Enums;

public class TestingDay {
    public static void main(String[] args) {
        System.out.println("Method 1, Printing all the days of the week");
        System.out.println(Day.MONDAY);
        System.out.println(Day.TUESDAY);
        System.out.println(Day.WEDNESDAY);
        System.out.println(Day.THURSDAY);
        System.out.println(Day.FRIDAY);
        System.out.println(Day.SATURDAY);
        System.out.println(Day.SUNDAY);
        System.out.println();

        System.out.println("This is a second method to print days of week ");
        for (Day day : Day.values()) {
            System.out.println(day);


        }
    }
}
