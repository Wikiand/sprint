package sprint;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayChecker {

    public static String checkDayType(LocalDate date) {
        String result;
        DayOfWeek day = date.getDayOfWeek();

        switch (day) {
            case SATURDAY:
            case SUNDAY:
                result = "Weekend";
                break;
            case WEDNESDAY:
                result = "Hump Day!";
                break;
            default:
                result = "Weekday";
                break;
        }

        return result;
    }
}

