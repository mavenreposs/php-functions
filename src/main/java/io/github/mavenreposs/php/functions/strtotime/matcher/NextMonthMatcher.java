package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class NextMonthMatcher implements Matcher {

    private final Pattern days = Pattern.compile("next month");

    public NextMonthMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        if (days.matcher(input).matches()) {
            int d = 1;
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.MONTH, d);
            return calendar.getTime();
        }
        return null;
    }
}
