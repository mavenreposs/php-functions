package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatMatcher implements Matcher {

    private final DateFormat dateFormat;

    public DateFormatMatcher(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public Date tryConvert(String input, Date date) {
        try {
            return dateFormat.parse(input);
        } catch (ParseException ex) {
            return null;
        }
    }
}
