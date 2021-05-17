package io.github.mavenreposs.php.functions;

import io.github.mavenreposs.php.functions.strtotime.DateFormatter;
import io.github.mavenreposs.php.functions.strtotime.StrToTime;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Test_StrToTime {

    @Test
    public void test_strtotime01() {
        Date date = StrToTime.strtotime("2008/06/30");
        System.out.println(date);

        Date date2 = StrToTime.strtotime("2008/06/30");
        System.out.println(date2);
    }

    @Test
    public void test_strtotime02() {
        Date date = StrToTime.strtotime("06/30/2008");
        System.out.println(date);
    }

    @Test
    public void test_strtotime03() {
        Date date = StrToTime.strtotime("20080630");
        System.out.println(date);

        Date date2 = StrToTime.strtotime("2008");
        System.out.println(date2);
    }

    @Test
    public void test_strtotime04() {
        Date date = StrToTime.strtotime("2008-06-30");
        System.out.println(date);

        Date date2 = StrToTime.strtotime("08-06-30");
        System.out.println(date2);

        Date date3 = StrToTime.strtotime("2008-06-30 11:59:59");
        System.out.println(date3);

        Date date4 = StrToTime.strtotime("2008-06-30 11:59");
        System.out.println(date4);

        Date date5 = StrToTime.strtotime("2008-06-30 11:59:59.206");
        System.out.println(date5);

        Date date6 = StrToTime.strtotime("2008-06-30 11:59:59.206+0800");
        System.out.println(date6);

        Date date7 = StrToTime.strtotime("2008-06-30 11:59:59.206-0800");
        System.out.println(date7);

        Date date8 = StrToTime.strtotime("Mon, 10 May 2021 11:00:40 +0800");
        System.out.println(date8);

        Date date9 = StrToTime.strtotime("Mon May 10 11:07:22 CST 2021");
        System.out.println(date9);
    }

    @Test
    public void test_strtotime05() {
        Date date = StrToTime.strtotime("2008 06 30");
        System.out.println(date);
    }

    @Test
    public void test_strtotime06() {
        Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("06"));
        System.out.println(date);
    }

    @Test
    public void test_strtotime07() {
        Date date = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080630"));
        System.out.println(date);
        Date date2 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("2008063"));
        System.out.println(date2);
        Date date3 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080604"));
        System.out.println(date3);
    }

    @Test
    public void test_strtotime08() {
        Date date = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/30"));
        System.out.println(date);
        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/3"));
        System.out.println(date2);
        Date date3 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/04"));
        System.out.println(date3);
    }

    @Test
    public void test_strtotime09() {
        Date date = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/30/2008"));
        System.out.println(date);
        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/3/2008"));
        System.out.println(date2);
        Date date3 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/04/2008"));
        System.out.println(date3);
        Date date4 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("6/5/2008"));
        System.out.println(date4);
    }

    @Test
    public void test_strtotime10() {
        Date date = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-30"));
        System.out.println(date);
        Date date2 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-3"));
        System.out.println(date2);
        Date date3 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-04"));
        System.out.println(date3);
        Date date4 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-6-5"));
        System.out.println(date4);
    }

    @Test
    public void test_strtotime11() {
        Date date = StrToTime.strtotime(DateFormatter.TwoDigitYear.setValue("08"));
        System.out.println(date);

        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYear.setValue("2008"));
        System.out.println(date2);
    }

    @Test
    public void test_strtotime12() {
        Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("08"));
        System.out.println(date);

        Date date2 = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("8"));
        System.out.println(date2);
    }

    @Test
    public void test_strtotime13() {
        Date date = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("08"));
        System.out.println(date);

        Date date2 = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("8"));
        System.out.println(date2);
    }

    @Test
    public void test_strtotime14() {
        Date date = StrToTime.strtotime(DateFormatter.HourOfDay24.setValue("18"));
        System.out.println(date);

        Date date2 = StrToTime.strtotime(DateFormatter.HourOfDay12.setValue("8"));
        System.out.println(date2);
    }

    @Test
    public void test_strtotime15() {
        Date date = StrToTime.strtotime("yesterday");
        System.out.println(date);

        Date date2 = StrToTime.strtotime("3 days");
        System.out.println(date2);

        Date date3 = StrToTime.strtotime("+3 days");
        System.out.println(date3);

        Date date4 = StrToTime.strtotime("-3 days");
        System.out.println(date4);
    }

    @Test
    public void test_strtotime16() {
        Date date2 = StrToTime.strtotime("3 weeks");
        System.out.println(date2);

        Date date3 = StrToTime.strtotime("+3 weeks");
        System.out.println(date3);

        Date date4 = StrToTime.strtotime("-3 weeks");
        System.out.println(date4);
    }

    @Test
    public void test_strtotime17() {
        Date date2 = StrToTime.strtotime("3 year");
        System.out.println(date2);

        Date date3 = StrToTime.strtotime("+3 year");
        System.out.println(date3);

        Date date4 = StrToTime.strtotime("-3 year");
        System.out.println(date4);
    }

    @Test
    public void test_strtotime18() {
        Date date2 = StrToTime.strtotime("3 month");
        System.out.println(date2);

        Date date3 = StrToTime.strtotime("+3 month");
        System.out.println(date3);

        Date date4 = StrToTime.strtotime("-3 month");
        System.out.println(date4);
    }

    @Test
    public void test_strtotime19() {
        // 下一个月
        Date date2 = StrToTime.strtotime("next month");
        System.out.println(date2);

        // 下一个月第一天
        Date date3 = StrToTime.strtotime("first day of next month");
        System.out.println(date3);

        // 上一个月第一天
        Date date4 = StrToTime.strtotime("first day of -1 month");
        System.out.println(date4);

        // 上两个月第一天
        Date date5 = StrToTime.strtotime("first day of +2 month");
        System.out.println(date5);

        // 上两个月第一天
        Date date6 = StrToTime.strtotime("first day of +2 month", date5);
        System.out.println(date6);
    }



}
