package io.github.mavenreposs.php.functions.strtotime;

public enum DateFormatter {
    EightDigitYearMonthDay("yyyyMMdd"), // Eight digit year, month and day
    EightDigitYearMonthDayWithTime("yyyyMMddHHmmss"), // Eight digit year, month and day
    FourDigitYearMonthDayWithSlashes("yyyy/MM/dd"), // Four digit year, month and day with slashes
    FourDigitYearMonthWithSlashes("yyyy/MM"), // Four digit year, month with slashes
    TwoDigitYearMonthDayWithSlashes("yy/MM/dd"), // Four digit year, month and day with slashes
    FourDigitYearMonthDayWithSpaces("yyyy MM dd"), // Four digit year, month and day with spaces
    FourDigitMonthDayYearWithSlashes("MM/dd/yyyy"), // Four digit year, month and day with slashes

    TwoDigitYearMonthDayWithDashes("yy-MM-dd"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDashes("yyyy-MM-dd"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDashesTimeNotSecond("yyyy-MM-dd HH:mm"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDashesTime("yyyy-MM-dd HH:mm:ss"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDashesTimeMillisecond("yyyy-MM-dd HH:mm:ss.SSS"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDashesTimeMillisecondTimeZone("yyyy-MM-dd HH:mm:ss.SSSZ"), // Two digit year, month and day with dashes

    WeekMonthYearWithTimeMillisecondTimeZone("EEEEE MMMMM yyyy HH:mm:ss.SSSZ"), // Two digit year, month and day with dashes
    WeekDayMonthYearWithTimeMillisecondTimeZone("EEE, d MMM yyyy HH:mm:ss Z"), // Two digit year, month and day with dashes
    WeekMonthDayWithTimeMillisecondTimeZoneYear("EEE MMM d HH:mm:ss z yyyy"), // Two digit year, month and day with dashes
    FourDigitYearMonthDayWithDotsTimeMillisecondTimeZone("yyyy.MM.dd 'at' HH:mm:ss z"), // Two digit year, month and day with dashes

    TwoDigitDayMonthYearWithDashes("dd-MM-yy"), // Two digit year, month and day with dashes
    FourDigitDayMonthYearWithDashes("dd-MM-yyyy"), // Two digit year, month and day with dashes

    TwoDigitMonthDayYearWithDashes("MM-dd-yy"), // Two digit year, month and day with dashes
    FourDigitMonthDayYearWithDashes("MM-dd-yyyy"), // Four digit year, month and day with dashes

    TwoDigitYear("yy"), // Two digit year
    FourDigitYear("yyyy"), // Four digit year
    MonthInYear("MM"), // Two digit month
    DayOfYear("DD"), // Two digit day of year
    DayOfMonth("dd"), // Two digit day of month
    HourOfDay24("H"), // Hour of day
    HourOfDay12("h"), // Hour of day
    MinuteInHour("mm"), // Minute in hour
    SecondInMinute("ss"), // Second in minute
    MillisecondInSecond("SSS"), // Millisecond in second
    DayInWeek("E"), // Day in week, Sat
    DayInWeekFull("EEEE"), // Day in week, Saturday
    DayOfWeekInMonth("F"), // Day of week in month, 1st Thursday of December
    WeekInYear("w"), // Week in year
    WeekInMonth("W"), // Week in month
    AMPMMarker("a"), // AM / PM marker
    HourInDay("k"), // Hour in day (1-24, unlike HH's 0-23)
    HourInDayWithAMPM("K"), // Hour in day, AM / PM (0-11)
    TimeZone("z"), // Time Zone
    ;

    private final String format;

    private Object value;

    DateFormatter(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public Object getValue() {
        return value;
    }

    public <T> DateFormatter setValue(T value) {
        this.value = value;
        return this;
    }

}
