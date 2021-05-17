package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class TomorrowMatcher implements Matcher {

    private final Pattern tomorrow = Pattern.compile("tomorrow");

    public TomorrowMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        if (tomorrow.matcher(input).matches()) {
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.DAY_OF_YEAR, +1);
            return calendar.getTime();
        } else {
            return null;
        }
    }
}
