package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class YesterdayMatcher implements Matcher {

    private final Pattern yesterday = Pattern.compile("yesterday");

    public YesterdayMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        if (yesterday.matcher(input).matches()) {
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.DAY_OF_YEAR, -1);
            return calendar.getTime();
        } else {
            return null;
        }
    }
}
