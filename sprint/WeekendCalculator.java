package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendCalculator {

    // Check if a single date is weekend
    public static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    // Count how many weekend days are between start and end (inclusive)
    public long countWeekendDays(LocalDate start, LocalDate end) {
        long count = 0;
        LocalDate current = start;

        while (!current.isAfter(end)) {
            if (isWeekend(current)) {
                count++;
            }
            current = current.plusDays(1);
        }

        return count;
    }
}
