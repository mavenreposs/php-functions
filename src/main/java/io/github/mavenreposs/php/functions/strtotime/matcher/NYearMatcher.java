package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class NYearMatcher implements Matcher {

    private final Pattern days = Pattern.compile("[\\-\\+]?\\d+ year");

    public NYearMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        if (days.matcher(input).matches()) {
            int d = Integer.parseInt(input.split(" ")[0]);
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.YEAR, d);
            return calendar.getTime();
        }
        return null;
    }
}
