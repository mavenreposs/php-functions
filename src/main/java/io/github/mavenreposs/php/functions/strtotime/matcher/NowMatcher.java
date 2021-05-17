package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Date;
import java.util.regex.Pattern;

public class NowMatcher implements Matcher {

    private final Pattern now = Pattern.compile("now");

    public NowMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        if (now.matcher(input).matches()) {
            if (date != null) {
                return date;
            } else {
                return new Date();
            }
        } else {
            return null;
        }
    }
}
