package io.github.mavenreposs.php.functions;

import io.github.mavenreposs.php.functions.strtotime.DateFormatter;
import io.github.mavenreposs.php.functions.strtotime.StrToTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.TimeZone;

public class Test_StrToTime {

    @BeforeAll
    public static void setTimeZone() {
        TimeZone zone = TimeZone.getTimeZone("Asia/Shanghai");
        TimeZone.setDefault(zone);
    }

    // 1621222199 (2021-05-17 11:29:59)
    private static final int nowTime = 1621222199;

    @Test
    public void test_strtotime01() {
        Date date = StrToTime.strtotime("2008/06/30");
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime("2008/06/30");
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Mon Jun 30 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime02() {
        Date date = StrToTime.strtotime("06/30/2008");
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime03() {
        Date date = StrToTime.strtotime("20080630");
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime("2008");
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jan 01 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime04() {
        Date date = StrToTime.strtotime("2008-06-30");
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime("08-06-30");
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date3 = StrToTime.strtotime("2008-06-30 11:59:59");
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Mon Jun 30 11:59:59 CST 2008");

        Date date4 = StrToTime.strtotime("2008-06-30 11:59");
        System.out.println(date4);
        Assertions.assertEquals(date4.toString(), "Mon Jun 30 11:59:00 CST 2008");

        Date date5 = StrToTime.strtotime("2008-06-30 11:59:59.206");
        System.out.println(date5);
        Assertions.assertEquals(date5.toString(), "Mon Jun 30 11:59:59 CST 2008");

        Date date6 = StrToTime.strtotime("2008-06-30 11:59:59.206+0800");
        System.out.println(date6);
        Assertions.assertEquals(date6.toString(), "Mon Jun 30 11:59:59 CST 2008");

        Date date7 = StrToTime.strtotime("2008-06-30 11:59:59.206-0800");
        System.out.println(date7);
        Assertions.assertEquals(date7.toString(), "Tue Jul 01 03:59:59 CST 2008");

        Date date8 = StrToTime.strtotime("Mon, 10 May 2021 11:00:40 +0800");
        System.out.println(date8);
        Assertions.assertEquals(date8.toString(), "Mon May 10 11:00:40 CST 2021");

        Date date9 = StrToTime.strtotime("Mon May 10 11:07:22 CST 2021");
        System.out.println(date9);
        Assertions.assertEquals(date9.toString(), "Mon May 10 11:07:22 CST 2021");
    }

    @Test
    public void test_strtotime05() {
        Date date = StrToTime.strtotime("2008 06 30");
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime06() {
        Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("06"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 01 00:00:00 CST 1970");
    }

    @Test
    public void test_strtotime07() {
        Date date = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080630"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("2008063"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

        Date date3 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080604"));
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime08() {
        Date date = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/30"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/3"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

        Date date3 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/04"));
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime09() {
        Date date = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/30/2008"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/3/2008"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

        Date date3 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/04/2008"));
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");

        Date date4 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("6/5/2008"));
        System.out.println(date4);
        Assertions.assertEquals(date4.toString(), "Thu Jun 05 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime10() {
        Date date = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-30"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-3"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

        Date date3 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-04"));
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");

        Date date4 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-6-5"));
        System.out.println(date4);
        Assertions.assertEquals(date4.toString(), "Thu Jun 05 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime11() {
        Date date = StrToTime.strtotime(DateFormatter.TwoDigitYear.setValue("08"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Tue Jan 01 00:00:00 CST 2008");

        Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYear.setValue("2008"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jan 01 00:00:00 CST 2008");
    }

    @Test
    public void test_strtotime12() {
        Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("08"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Sat Aug 01 00:00:00 CST 1970");

        Date date2 = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("8"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Sat Aug 01 00:00:00 CST 1970");
    }

    @Test
    public void test_strtotime13() {
        Date date = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("08"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Thu Jan 08 00:00:00 CST 1970");

        Date date2 = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("8"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Thu Jan 08 00:00:00 CST 1970");
    }

    @Test
    public void test_strtotime14() {
        Date date = StrToTime.strtotime(DateFormatter.HourOfDay24.setValue("18"));
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Thu Jan 01 18:00:00 CST 1970");

        Date date2 = StrToTime.strtotime(DateFormatter.HourOfDay12.setValue("8"));
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Thu Jan 01 08:00:00 CST 1970");
    }

    @Test
    public void test_strtotime15() {
        Date date = StrToTime.strtotime("yesterday", nowTime);
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Sun May 16 11:29:59 CST 2021");

        Date date2 = StrToTime.strtotime("3 days", nowTime);
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Thu May 20 11:29:59 CST 2021");

        Date date3 = StrToTime.strtotime("+3 days", nowTime);
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Thu May 20 11:29:59 CST 2021");

        Date date4 = StrToTime.strtotime("-3 days", nowTime);
        System.out.println(date4);
        Assertions.assertEquals(date4.toString(), "Fri May 14 11:29:59 CST 2021");
    }

    @Test
    public void test_strtotime16() {
        Date date = StrToTime.strtotime("3 weeks", nowTime);
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Mon Jun 07 11:29:59 CST 2021");

        Date date2 = StrToTime.strtotime("+3 weeks", nowTime);
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Mon Jun 07 11:29:59 CST 2021");

        Date date3 = StrToTime.strtotime("-3 weeks", nowTime);
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Mon Apr 26 11:29:59 CST 2021");
    }

    @Test
    public void test_strtotime17() {
        Date date = StrToTime.strtotime("3 year", nowTime);
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Fri May 17 11:29:59 CST 2024");

        Date date2 = StrToTime.strtotime("+3 year", nowTime);
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Fri May 17 11:29:59 CST 2024");

        Date date3 = StrToTime.strtotime("-3 year", nowTime);
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Thu May 17 11:29:59 CST 2018");
    }

    @Test
    public void test_strtotime18() {
        Date date = StrToTime.strtotime("3 month", nowTime);
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Tue Aug 17 11:29:59 CST 2021");

        Date date2 = StrToTime.strtotime("+3 month", nowTime);
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Aug 17 11:29:59 CST 2021");

        Date date3 = StrToTime.strtotime("-3 month", nowTime);
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Wed Feb 17 11:29:59 CST 2021");
    }

    @Test
    public void test_strtotime19() {
        // 下一个月
        Date date = StrToTime.strtotime("next month", nowTime);
        System.out.println(date);
        Assertions.assertEquals(date.toString(), "Thu Jun 17 11:29:59 CST 2021");

        // 下一个月第一天
        Date date2 = StrToTime.strtotime("first day of next month", nowTime);
        System.out.println(date2);
        Assertions.assertEquals(date2.toString(), "Tue Jun 01 00:00:00 CST 2021");

        // 上一个月第一天
        Date date3 = StrToTime.strtotime("first day of -1 month", nowTime);
        System.out.println(date3);
        Assertions.assertEquals(date3.toString(), "Thu Apr 01 00:00:00 CST 2021");

        // 上两个月第一天
        Date date4 = StrToTime.strtotime("first day of +2 month", nowTime);
        System.out.println(date4);
        Assertions.assertEquals(date4.toString(), "Thu Jul 01 00:00:00 CST 2021");

        // 上两个月第一天
        Date date5 = StrToTime.strtotime("first day of +2 month", date4);
        System.out.println(date5);
        assert date5 != null;
        Assertions.assertEquals(date5.toString(), "Wed Sep 01 00:00:00 CST 2021");
    }



}
