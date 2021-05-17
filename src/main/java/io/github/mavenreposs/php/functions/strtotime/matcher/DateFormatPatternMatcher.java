package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.DateFormatter;
import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateFormatPatternMatcher implements Matcher {

    private DateFormat dateFormat;

    private static final String FourDigitYearMonthDayWithDashes = "(\\d{4})-(\\d{2})-(\\d{2})";
    private static final String TwoDigitYearMonthDayWithDashes = "(\\d{2})-(\\d{2})-(\\d{2})";
    private static final String FourDigitYearMonthDayWithDashesTimeNotSecond = "(\\d{4})-(\\d{2})-(\\d{2}) (\\d{2}):(\\d{2})";
    private static final String FourDigitYearMonthDayWithDashesTime = "(\\d{4})-(\\d{2})-(\\d{2}) (\\d{2}):(\\d{2}):(\\d{2})";
    private static final String FourDigitYearMonthDayWithDashesTimeMillisecond = "(\\d{4})-(\\d{2})-(\\d{2}) (\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})";
    private static final String FourDigitYearMonthDayWithDashesTimeMillisecondTimeZone = "(\\d{4})-(\\d{2})-(\\d{2}) (\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})[-+](\\d{4})";
    private static final String WeekDayMonthYearWithTimeMillisecondTimeZone = "[a-zA-Z_]{3}, (\\d{2}) [a-zA-Z_]{3} (\\d{4}) (\\d{2}):(\\d{2}):(\\d{2}) [-+](\\d{4})";
    private static final String WeekMonthDayWithTimeMillisecondTimeZoneYear = "[a-zA-Z_]{3} [a-zA-Z_]{3} (\\d{2}) (\\d{2}):(\\d{2}):(\\d{2}) [a-zA-Z_]{3} (\\d{4})";

    private static final String FourDigitYearMonthDayWithSlashes = "(\\d{4})/(\\d{2})/(\\d{2})";
    private static final String TwoDigitYearMonthDayWithSlashes = "(\\d{2})/(\\d{2})/(\\d{2})";

    private static final String FourDigitMonthDayYearWithSlashes = "((\\d{2})/(\\d{2})/(\\d{4}))";

    private static final String FourDigitYearMonthDayWithSpaces = "(\\d{4}) (\\d{2}) (\\d{2})";

    private static final String EightDigitYearMonthDay = "(\\d{8})";
    private static final String FourDigitYear = "(\\d{4})";

    public DateFormatPatternMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        try {
            if (Pattern.compile(FourDigitYearMonthDayWithDashes).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithDashes.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(TwoDigitYearMonthDayWithDashes).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.TwoDigitYearMonthDayWithDashes.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithDashesTime).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithDashesTime.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithDashesTimeNotSecond).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithDashesTimeNotSecond.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithDashesTimeMillisecond).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithDashesTimeMillisecond.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithDashesTimeMillisecondTimeZone).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithDashesTimeMillisecondTimeZone.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithSlashes).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithSlashes.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(TwoDigitYearMonthDayWithSlashes).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.TwoDigitYearMonthDayWithSlashes.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(EightDigitYearMonthDay).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.EightDigitYearMonthDay.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYear).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYear.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitMonthDayYearWithSlashes).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitMonthDayYearWithSlashes.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(FourDigitYearMonthDayWithSpaces).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.FourDigitYearMonthDayWithSpaces.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(WeekDayMonthYearWithTimeMillisecondTimeZone).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.WeekDayMonthYearWithTimeMillisecondTimeZone.getFormat());
                return dateFormat.parse(input);
            }
            if (Pattern.compile(WeekMonthDayWithTimeMillisecondTimeZoneYear).matcher(input).matches()) {
                dateFormat = new SimpleDateFormat(DateFormatter.WeekMonthDayWithTimeMillisecondTimeZoneYear.getFormat());
                return dateFormat.parse(input);
            }
            else {
                return null;
            }
        } catch (ParseException ex) {
            return null;
        }
    }
}
