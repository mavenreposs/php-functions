package io.github.mavenreposs.php.functions;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class PHPFunctions {

    private PHPFunctions() {
    }

    /**
     * @param separator
     * @param string
     * @return
     */
    public static String[] explode(String separator, String string) {
        return StringUtils.splitByWholeSeparatorPreserveAllTokens(string, separator);
    }

    /**
     * @param separator
     * @param string
     * @param limit
     * @return
     */
    public static String[] explode(String separator, String string, int limit) {
        return StringUtils.splitByWholeSeparatorPreserveAllTokens(string, separator, limit);
    }

    /**
     * @param separator
     * @param values
     * @return
     */
    public static String implode(String separator, String[] values) {
        return StringUtils.join(values, separator);
    }

    /**
     * @param haystack
     * @param needle
     * @return
     */
    public static int strrpos(String haystack, String needle) {
        return StringUtils.lastIndexOfAny(haystack, needle);
    }

    /**
     * @param haystack
     * @param needle
     * @return
     */
    public static int strpos(String haystack, String needle) {
        return StringUtils.indexOfAny(haystack, needle);
    }

    /**
     * 返回字符串的子串
     *
     * @return
     */
    public static String substr(String string, int start, int length) {
        return "";
    }

    /**
     * 将首字母转换成大小字母
     *
     * @param string 字符串
     * @return 字符串
     */
    public static String ucwords(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    /**
     * 使一个字符串的第一个字符小写
     *
     * @param string 输入的字符串。
     * @return 返回第一个字母小写的 str ，如果是字母的话。
     */
    public static String lcfirst(String string) {
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    /**
     * @param string
     * @return
     */
    public static String trim(String string) {
        return StringUtils.trim(string);
    }

    /**
     * @param string
     * @return
     */
    public static String ltrim(String string) {
        return StringUtils.stripStart(string, null);
    }

    /**
     * @param string
     * @return
     */
    public static String ltrim(String string, final String stripChars) {
        return StringUtils.stripStart(string, stripChars);
    }

    /**
     * @param string
     * @return
     */
    public static String rtrim(String string) {
        return StringUtils.stripEnd(string, null);
    }

    /**
     * @param string
     * @return
     */
    public static String rtrim(String string, final String stripChars) {
        return StringUtils.stripEnd(string, stripChars);
    }

    /**
     * 舍去法取整
     *
     * @param value 要取整的数字
     * @return 返回不大于 value 的最接近的整数，舍去小数部分取整。
     */
    public static Double floor(double value) {
        return Math.floor(value);
    }

    /**
     * 进一法取整
     *
     * @param value 要进一法取整的值
     * @return 返回不小于 value 的下一个整数，value 如果有小数部分则进一位。
     */
    public static Double ceil(double value) {
        return Math.ceil(value);
    }

    /**
     * 对浮点数进行四舍五入
     *
     * @param value 要处理的值。
     * @return 返回将 val （十进制小数点后数字的数目）进行四舍五入的结果。
     */
    public static Integer round(float value) {
        return Math.round(value);
    }

    /**
     * 对浮点数进行四舍五入
     *
     * @param value 要处理的值。
     * @return 返回将 val （十进制小数点后数字的数目）进行四舍五入的结果。
     */
    public static Long round(double value) {
        return Math.round(value);
    }

    /**
     * 获得系统当前时间区的时间戳 (微秒)
     * @return 13位时间戳 (微秒)
     */
    public static long microtime() {
        TimeZone tz = TimeZone.getDefault();
        Calendar cal = Calendar.getInstance(tz);
        Date date = cal.getTime();
        return date.getTime();
    }

    /**
     * 获得系统当前时间区的时间戳
     * @return 10位时间戳
     */
    public static int time() {
        OffsetDateTime now = OffsetDateTime.now();
        return (int) now.toEpochSecond();
    }

    /**
     * 获得JAVA的DATE时间转的时间戳
     *
     * @return 10位时间戳
     */
    public static int time(Date date) {
        return (int) (date.getTime() / 1000);
    }

    /**
     * 获得当前格林威治时间的时间戳
     * @return 10位时间戳
     */
    public static int gmtime() {
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        return (int) now.toEpochSecond();
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @return int
     */
    public static int mktime() {
        return gmtime();
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @param hour 小时数
     * @return int
     */
    public static int mktime(int hour) {
        GetDate getDate = getdate(gmtime());
        return mktime(hour, getDate.getMinutes(), getDate.getSeconds(), getDate.getMon(), getDate.getMday(), getDate.getYear());
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @param hour 小时数
     * @param minute 分钟数
     * @return int
     */
    public static int mktime(int hour, int minute) {
        GetDate getDate = getdate(gmtime());
        return mktime(hour, minute, getDate.getSeconds(), getDate.getMon(), getDate.getMday(), getDate.getYear());
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @param hour 小时数
     * @param minute 分钟数
     * @param second 秒数（一分钟之内）
     * @return int
     */
    public static int mktime(int hour, int minute, int second) {
        GetDate getDate = getdate(gmtime());
        return mktime(hour, minute, second, getDate.getMon(), getDate.getMday(), getDate.getYear());
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @param hour 小时数
     * @param minute 分钟数
     * @param second 秒数（一分钟之内）
     * @param month 月份数
     * @return int
     */
    public static int mktime(int hour, int minute, int second, int month) {
        GetDate getDate = getdate(gmtime());
        return mktime(hour, minute, second, month, getDate.getMday(), getDate.getYear());
    }

    /**
     * 生成一个0时区日期的GMT时间戳
     *
     * @param hour 小时数
     * @param minute 分钟数
     * @param second 秒数（一分钟之内）
     * @param month 月份数
     * @param day 天数
     * @return int
     */
    public static int mktime(int hour, int minute, int second, int month, int day) {
        GetDate getDate = getdate(gmtime());
        return mktime(hour, minute, second, month, day, getDate.getYear());
    }

    /**
     * 生成一个格林威治区日期的GMT时间戳
     *
     * @param hour 小时数
     * @param minute 分钟数
     * @param second 秒数（一分钟之内）
     * @param month 月份数
     * @param day 天数
     * @param year 年份数
     * @return int
     */
    public static int mktime(int hour, int minute, int second, int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day, hour, minute, hour);
        Date date = cal.getTime();
        return (int) (date.getTime() / 1000);
    }

    /**
     * 返回一个根据 timestamp 得出的包含有日期信息的关联数组 array。如果没有给出时间戳则认为是当前本地时间。
     *
     * @return String[]
     */
    public static GetDate getdate() {
        return getdate(time());
    }

    /**
     * 返回一个根据 timestamp 得出的包含有日期信息的关联数组 array。如果没有给出时间戳则认为是当前本地时间。
     *
     * @param timestamp 时间戳
     * @return String[]
     */
    public static GetDate getdate(int timestamp) {
        Date date = Date.from(Instant.ofEpochSecond(timestamp));
        return getdate(date);
    }

    /**
     * 返回一个根据 timestamp 得出的包含有日期信息的关联数组 array。如果没有给出时间戳则认为是当前本地时间。
     *
     * @return String[]
     */
    public static GetDate getdate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int year = cal.get(Calendar.YEAR);//获取年份
        int month = cal.get(Calendar.MONTH);//获取月份
        int day = cal.get(Calendar.DATE);//获取日
        int hour = cal.get(Calendar.HOUR);//小时
        int minute = cal.get(Calendar.MINUTE);//分
        int second = cal.get(Calendar.SECOND);//秒
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);//一周的第几天
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);//一年的第几天
        int timestamp = time(date);//一年的第几天

        GetDate getDate = new GetDate();
        getDate.setYear(year);
        getDate.setMon(month);
        getDate.setHours(hour);
        getDate.setMinutes(minute);
        getDate.setSeconds(second);
        getDate.setMday(day);
        getDate.setWday(dayOfWeek - 1);
        getDate.setYday(dayOfYear);
        getDate.setWeekday(convertWeekDayText(dayOfWeek));
        getDate.setMonth(convertMonthText(month));
        getDate.setTime(timestamp);

        return getDate;
    }

    /**
     * 返回某个历法中某年中某月的天数
     * @param month 选定历法中的某月
     * @param year 选定历法中的某年
     * @return 指定历法中选定的某月的天数。
     */
    public static int cal_days_in_month(int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 返回某个历法中某年中某月的天数
     * @param calendar 用来计算的某个历法，不支持，默认 CAL_GREGORIAN （gregory）
     * @param month 选定历法中的某月
     * @param year 选定历法中的某年
     * @return 指定历法中选定的某月的天数。
     */
    public static int cal_days_in_month(int calendar, int month, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month, 0);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 获得当前时区的时间转换为自定义格式时间
     *
     * @return 格式化后的时间
     */
    public static String date() {
        String format = "yyyy-MM-dd HH:mm:ss";
        TimeZone tz = TimeZone.getDefault();
        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setTimeZone(tz);
        return dateFormat.format(new Date());
    }

    /**
     * 获得当前时区的时间转换为自定义格式时间
     *
     * @param format 时间格式
     * @return 格式化后的时间
     */
    public static String date(String format) {
        TimeZone tz = TimeZone.getDefault();
        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setTimeZone(tz);
        return dateFormat.format(new Date());
    }

    /**
     * 获得当前时区的时间转换为自定义格式时间
     *
     * @param format    时间格式
     * @param timestamp 指定时间戳
     * @return 格式化后的时间
     */
    public static String date(String format, long timestamp) {
        TimeZone tz = TimeZone.getDefault();
        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setTimeZone(tz);
        Date date = new Date(timestamp * 1000L);
        return dateFormat.format(date);
    }

    /**
     * 获得当前时区的时间转换为自定义格式时间
     *
     * @param format 时间格式
     * @param date   指定日期
     * @return 格式化后的时间
     */
    public static String date(String format, Date date) {
        TimeZone tz = TimeZone.getDefault();
        DateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setTimeZone(tz);
        return dateFormat.format(date);
    }

    /**
     * 产生一个随机整数
     * @param min 返回的最低值（默认：0）
     * @param max 返回的最高值
     * @return 随机整数
     */
    public static Integer rand(int min, int max) {
        return RandomUtils.nextInt(min, max);
    }

    /**
     * 产生一个随机整数
     * @param max 返回的最高值
     * @return 随机整数
     */
    public static Integer rand(int max) {
        return RandomUtils.nextInt(0, max);
    }

    /**
     * 产生一个随机整数
     * @return 随机整数
     */
    public static Integer rand() {
        return RandomUtils.nextInt();
    }

    /**
     * Convert the given string to lower-case.
     * 用于将字符串转换为小写
     *
     * @param value 输入字符串
     */
    public static String strtolower(String value) {
        return StringUtils.toRootLowerCase(value);
    }

    /**
     * convert the given string to upper-case.
     * 用于将指定字符串转换为大写
     *
     * @param value 输入字符串
     */
    public static String strtoupper(String value) {
        return StringUtils.toRootUpperCase(value);
    }

    /**
     * 返回星期几
     *
     * @param weekDay 星期数字
     * @return 星期文本显示
     */
    private static String convertWeekDayText(int weekDay) {
        String text;
        switch (weekDay) {
            case 1:
                text = "Sunday";
                break;
            case 2:
                text = "Monday";
                break;
            case 3:
                text = "Tuesday";
                break;
            case 4:
                text = "Wednesday";
                break;
            case 5:
                text = "Thursday";
                break;
            case 6:
                text = "Friday";
                break;
            case 7:
                text = "Saturday";
                break;
            default:
                text = null;
                break;
        }
        return text;
    }

    /**
     * 返回月份
     *
     * @param month 月份数字
     * @return 月份文本显示
     */
    private static String convertMonthText(int month) {
        String text;
        switch (month) {
            case 0:
                text = "January";
                break;
            case 1:
                text = "February";
                break;
            case 2:
                text = "March";
                break;
            case 3:
                text = "April";
                break;
            case 4:
                text = "May";
                break;
            case 5:
                text = "June";
                break;
            case 6:
                text = "July";
                break;
            case 7:
                text = "August";
                break;
            case 8:
                text = "September";
                break;
            case 9:
                text = "October";
                break;
            case 10:
                text = "November";
                break;
            case 11:
                text = "December";
                break;
            default:
                text = null;
                break;
        }
        return text;
    }

}
