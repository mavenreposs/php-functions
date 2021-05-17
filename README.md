# php-functions

将任何字符串的日期时间描述解析为 Unix 时间戳，仿PHP的strtotime函数，解析时间字符串为Java Date类型，方便进行各种转换。

参考地址：
https://www.php.net/manual/zh/function.strtotime.php

### Maven
```text
<!-- https://mvnrepository.com/artifact/io.github.mavenreposs/php-functions -->
<dependency>
    <groupId>io.github.mavenreposs</groupId>
    <artifactId>php-functions</artifactId>
    <version>1.0</version>
</dependency>
```

### Examples

```java
Date date = StrToTime.strtotime("2008/06/30");
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime("2008/06/30");
Assertions.assertEquals(date2.toString(), "Mon Jun 30 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime("06/30/2008");
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime("20080630");
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime("2008");
Assertions.assertEquals(date2.toString(), "Tue Jan 01 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime("2008-06-30");
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime("08-06-30");
Assertions.assertEquals(date2.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date3 = StrToTime.strtotime("2008-06-30 11:59:59");
Assertions.assertEquals(date3.toString(), "Mon Jun 30 11:59:59 CST 2008");

Date date4 = StrToTime.strtotime("2008-06-30 11:59");
Assertions.assertEquals(date4.toString(), "Mon Jun 30 11:59:00 CST 2008");

Date date5 = StrToTime.strtotime("2008-06-30 11:59:59.206");
Assertions.assertEquals(date5.toString(), "Mon Jun 30 11:59:59 CST 2008");

Date date6 = StrToTime.strtotime("2008-06-30 11:59:59.206+0800");
Assertions.assertEquals(date6.toString(), "Mon Jun 30 11:59:59 CST 2008");

Date date7 = StrToTime.strtotime("2008-06-30 11:59:59.206-0800");
Assertions.assertEquals(date7.toString(), "Tue Jul 01 03:59:59 CST 2008");

Date date8 = StrToTime.strtotime("Mon, 10 May 2021 11:00:40 +0800");
Assertions.assertEquals(date8.toString(), "Mon May 10 11:00:40 CST 2021");

Date date9 = StrToTime.strtotime("Mon May 10 11:07:22 CST 2021");
Assertions.assertEquals(date9.toString(), "Mon May 10 11:07:22 CST 2021");
```

```java
Date date = StrToTime.strtotime("2008 06 30");
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("06"));
Assertions.assertEquals(date.toString(), "Mon Jun 01 00:00:00 CST 1970");
```

```java
Date date = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080630"));
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("2008063"));
Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

Date date3 = StrToTime.strtotime(DateFormatter.EightDigitYearMonthDay.setValue("20080604"));
Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/30"));
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/3"));
Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

Date date3 = StrToTime.strtotime(DateFormatter.FourDigitYearMonthDayWithSlashes.setValue("2008/06/04"));
Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/30/2008"));
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/3/2008"));
Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

Date date3 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("06/04/2008"));
Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");

Date date4 = StrToTime.strtotime(DateFormatter.FourDigitMonthDayYearWithSlashes.setValue("6/5/2008"));
Assertions.assertEquals(date4.toString(), "Thu Jun 05 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-30"));
Assertions.assertEquals(date.toString(), "Mon Jun 30 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-3"));
Assertions.assertEquals(date2.toString(), "Tue Jun 03 00:00:00 CST 2008");

Date date3 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-06-04"));
Assertions.assertEquals(date3.toString(), "Wed Jun 04 00:00:00 CST 2008");

Date date4 = StrToTime.strtotime(DateFormatter.TwoDigitYearMonthDayWithDashes.setValue("2008-6-5"));
Assertions.assertEquals(date4.toString(), "Thu Jun 05 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.TwoDigitYear.setValue("08"));
Assertions.assertEquals(date.toString(), "Tue Jan 01 00:00:00 CST 2008");

Date date2 = StrToTime.strtotime(DateFormatter.FourDigitYear.setValue("2008"));
Assertions.assertEquals(date2.toString(), "Tue Jan 01 00:00:00 CST 2008");
```

```java
Date date = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("08"));
Assertions.assertEquals(date.toString(), "Sat Aug 01 00:00:00 CST 1970");

Date date2 = StrToTime.strtotime(DateFormatter.MonthInYear.setValue("8"));
Assertions.assertEquals(date2.toString(), "Sat Aug 01 00:00:00 CST 1970");
```

```java
Date date = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("08"));
Assertions.assertEquals(date.toString(), "Thu Jan 08 00:00:00 CST 1970");

Date date2 = StrToTime.strtotime(DateFormatter.DayOfMonth.setValue("8"));
Assertions.assertEquals(date2.toString(), "Thu Jan 08 00:00:00 CST 1970");
```

```java
Date date = StrToTime.strtotime(DateFormatter.HourOfDay24.setValue("18"));
Assertions.assertEquals(date.toString(), "Thu Jan 01 18:00:00 CST 1970");

Date date2 = StrToTime.strtotime(DateFormatter.HourOfDay12.setValue("8"));
Assertions.assertEquals(date2.toString(), "Thu Jan 01 08:00:00 CST 1970");
```

```java
Date date = StrToTime.strtotime("yesterday", nowTime);
Assertions.assertEquals(date.toString(), "Sun May 16 11:29:59 CST 2021");

Date date2 = StrToTime.strtotime("3 days", nowTime);
Assertions.assertEquals(date2.toString(), "Thu May 20 11:29:59 CST 2021");

Date date3 = StrToTime.strtotime("+3 days", nowTime);
Assertions.assertEquals(date3.toString(), "Thu May 20 11:29:59 CST 2021");

Date date4 = StrToTime.strtotime("-3 days", nowTime);
Assertions.assertEquals(date4.toString(), "Fri May 14 11:29:59 CST 2021");
```

```java
Date date = StrToTime.strtotime("3 weeks", nowTime);
Assertions.assertEquals(date.toString(), "Mon Jun 07 11:29:59 CST 2021");

Date date2 = StrToTime.strtotime("+3 weeks", nowTime);
Assertions.assertEquals(date2.toString(), "Mon Jun 07 11:29:59 CST 2021");

Date date3 = StrToTime.strtotime("-3 weeks", nowTime);
Assertions.assertEquals(date3.toString(), "Mon Apr 26 11:29:59 CST 2021");
```

```java
Date date = StrToTime.strtotime("3 year", nowTime);
Assertions.assertEquals(date.toString(), "Fri May 17 11:29:59 CST 2024");

Date date2 = StrToTime.strtotime("+3 year", nowTime);
Assertions.assertEquals(date2.toString(), "Fri May 17 11:29:59 CST 2024");

Date date3 = StrToTime.strtotime("-3 year", nowTime);
Assertions.assertEquals(date3.toString(), "Thu May 17 11:29:59 CST 2018");
```

```java
Date date = StrToTime.strtotime("3 month", nowTime);
Assertions.assertEquals(date.toString(), "Tue Aug 17 11:29:59 CST 2021");

Date date2 = StrToTime.strtotime("+3 month", nowTime);
Assertions.assertEquals(date2.toString(), "Tue Aug 17 11:29:59 CST 2021");

Date date3 = StrToTime.strtotime("-3 month", nowTime);
Assertions.assertEquals(date3.toString(), "Wed Feb 17 11:29:59 CST 2021");
```

```java
// 下一个月
Date date = StrToTime.strtotime("next month", nowTime);
Assertions.assertEquals(date.toString(), "Thu Jun 17 11:29:59 CST 2021");

// 下一个月第一天
Date date2 = StrToTime.strtotime("first day of next month", nowTime);
Assertions.assertEquals(date2.toString(), "Tue Jun 01 00:00:00 CST 2021");

// 上一个月第一天
Date date3 = StrToTime.strtotime("first day of -1 month", nowTime);
Assertions.assertEquals(date3.toString(), "Thu Apr 01 00:00:00 CST 2021");

// 上两个月第一天
Date date4 = StrToTime.strtotime("first day of +2 month", nowTime);
Assertions.assertEquals(date4.toString(), "Thu Jul 01 00:00:00 CST 2021");

// 上两个月第一天
Date date5 = StrToTime.strtotime("first day of +2 month", date4);
Assertions.assertEquals(date5.toString(), "Wed Sep 01 00:00:00 CST 2021");
```