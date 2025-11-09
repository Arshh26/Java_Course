package Enums;

public enum DayTwo {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekday;

    DayTwo(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Not a Weekday";
    }
}
