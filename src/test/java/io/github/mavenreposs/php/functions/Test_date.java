package io.github.mavenreposs.php.functions;

import io.github.mavenreposs.php.functions.strtotime.DateFormatter;
import io.github.mavenreposs.php.functions.strtotime.StrToTime;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Test_date {

    @Test
    public void test_date01() {
        String str = StrToTime.date(DateFormatter.HourOfDay24.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date02() {
        String str = StrToTime.date(DateFormatter.HourOfDay12.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date03() {
        String str = StrToTime.date(DateFormatter.DayOfYear.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.DayOfMonth.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date04() {
        String str = StrToTime.date(DateFormatter.MonthInYear.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date05() {
        String str = StrToTime.date(DateFormatter.MinuteInHour.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date06() {
        String str = StrToTime.date(DateFormatter.SecondInMinute.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date07() {
        String str = StrToTime.date(DateFormatter.MillisecondInSecond.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date08() {
        String str = StrToTime.date(DateFormatter.DayInWeek.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.DayInWeekFull.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date09() {
        String str = StrToTime.date(DateFormatter.DayOfWeekInMonth.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date10() {
        String str = StrToTime.date(DateFormatter.WeekInYear.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.WeekInMonth.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date11() {
        String str = StrToTime.date(DateFormatter.AMPMMarker.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date12() {
        String str = StrToTime.date(DateFormatter.HourInDay.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.HourInDayWithAMPM.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date13() {
        String str = StrToTime.date(DateFormatter.TimeZone.setValue(new Date()));
        System.out.println(str);
    }

    @Test
    public void test_date14() {
        String str = StrToTime.date(DateFormatter.TwoDigitMonthDayYearWithDashes.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.FourDigitMonthDayYearWithDashes.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date15() {
        String str = StrToTime.date(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.FourDigitYearMonthDayWithDashes.setValue(new Date()));
        System.out.println(str2);

        String str3 = StrToTime.date(DateFormatter.FourDigitYearMonthDayWithDashesTime.setValue(new Date()));
        System.out.println(str3);

        String str4 = StrToTime.date(DateFormatter.FourDigitYearMonthDayWithDashesTimeMillisecond.setValue(new Date()));
        System.out.println(str4);

        String str5 = StrToTime.date(DateFormatter.FourDigitYearMonthDayWithDashesTimeMillisecondTimeZone.setValue(new Date()));
        System.out.println(str5);

        String str6 = StrToTime.date(DateFormatter.WeekMonthYearWithTimeMillisecondTimeZone.setValue(new Date()));
        System.out.println(str6);
    }

    @Test
    public void test_date16() {
        String str = StrToTime.date(DateFormatter.TwoDigitDayMonthYearWithDashes.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.FourDigitDayMonthYearWithDashes.setValue(new Date()));
        System.out.println(str2);
    }

    @Test
    public void test_date17() {
        String str = StrToTime.date(DateFormatter.FourDigitYearMonthDayWithDotsTimeMillisecondTimeZone.setValue(new Date()));
        System.out.println(str);

        String str2 = StrToTime.date(DateFormatter.WeekDayMonthYearWithTimeMillisecondTimeZone.setValue(new Date()));
        System.out.println(str2);

        String str3 = StrToTime.date(DateFormatter.WeekMonthDayWithTimeMillisecondTimeZoneYear.setValue(new Date()));
        System.out.println(str3);
    }

}
