package task3;

public class DayOfWeekRunner {
    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        DaysOfWeek tuesday = DaysOfWeek.TUESDAY;
        DaysOfWeek sunday = DaysOfWeek.SUNDAY;

        System.out.println(monday.isWeekend());
        System.out.println(tuesday.isWeekend());
        System.out.println(sunday.isWeekend());
    }
}
