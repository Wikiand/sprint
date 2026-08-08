
package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CalendarBuilder {

    public static String buildCalendar(String monthName, int year) {
        // Parse month name into Month enum
        Month month = Month.valueOf(monthName.toUpperCase());

        // First day of the month
        LocalDate firstDay = LocalDate.of(year, month, 1);
        int lengthOfMonth = month.length(firstDay.isLeapYear());

        StringBuilder sb = new StringBuilder();

        // Header
        sb.append(monthName.toUpperCase()).append(" ").append(year).append("\n");
        sb.append("Mon Tue Wed Thu Fri Sat Sun").append("\n");

        // Find the weekday of the first day
        DayOfWeek firstDayOfWeek = firstDay.getDayOfWeek();
        int dayOfWeekValue = firstDayOfWeek.getValue(); // Monday=1 ... Sunday=7

        // Add leading spaces for empty days before the 1st
        for (int i = 1; i < dayOfWeekValue; i++) {
            sb.append("    "); // 4 spaces for empty day
        }

        // Print each day
        for (int day = 1; day <= lengthOfMonth; day++) {
            if (day < 10) {
                sb.append("  ").append(day); // two leading spaces for single-digit
            } else {
                sb.append(" ").append(day);  // one leading space for double-digit
            }

            // Check if end of week or end of month
            LocalDate current = LocalDate.of(year, month, day);
            if (current.getDayOfWeek() == DayOfWeek.SUNDAY || day == lengthOfMonth) {
                sb.append("\n");
            } else {
                sb.append(" "); // single space after each day
            }
        }

        // Trim trailing whitespace
        return sb.toString().stripTrailing();
    }
}
