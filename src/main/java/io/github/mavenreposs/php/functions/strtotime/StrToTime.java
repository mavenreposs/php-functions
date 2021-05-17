package io.github.mavenreposs.php.functions.strtotime;

import io.github.mavenreposs.php.functions.strtotime.matcher.DateFormatMatcher;

import java.text.SimpleDateFormat;
import java.util.*;

public final class StrToTime {

    private final List<Matcher> matchers = new LinkedList<>();

    private volatile static StrToTime singleton;

    public static StrToTime getSingleton() {
        synchronized (StrToTime.class) {
            if (singleton == null) {
                singleton = new StrToTime();
            }
        }
        return singleton;
    }

    private StrToTime() {
        ServiceLoader<Matcher> classes = ServiceLoader.load(Matcher.class);
        for (Matcher matcher : classes) {
            matchers.add(matcher);
        }
    }

    public List<Matcher> getMatchers() {
        return matchers;
    }

    // not thread-safe
    public static void registerMatcher(Matcher matcher) {
        getSingleton().getMatchers().add(matcher);
    }

    /**
     * 字符串格式日期转Date类型
     * @param input 经过DateFormatter格式化后的
     * @return Date
     */
    public static Date strtotime(DateFormatter input) {
        Matcher matcher = new DateFormatMatcher(new SimpleDateFormat(input.getFormat()));
        return matcher.tryConvert((String) input.getValue(), null);
    }

    /**
     * 字符串格式日期转Date类型
     * @param input 输入日期
     * @return Date
     */
    public static Date strtotime(String input) {
        return strtotime(input, null);
    }

    /**
     * 字符串格式日期转Date类型
     * @param input 输入日期
     * @param now 指定日期的时间戳
     * @return Date
     */
    public static Date strtotime(String input, int now) {
        Date inDate = new Date(now * 1000L);
        return strtotime(input, inDate);
    }

    /**
     * 字符串格式日期转Date类型
     * @param input 输入日期
     * @param now 指定日期的时间戳
     * @return Date
     */
    public static Date strtotime(String input, long now) {
        Date inDate = new Date(now);
        return strtotime(input, inDate);
    }

    /**
     * 字符串格式日期转Date类型
     * @param input 输入日期
     * @param inDate 指定日期的Date类型
     * @return Date
     */
    public static Date strtotime(String input, Date inDate) {
        for (Matcher matcher : getSingleton().getMatchers()) {
            Date date = matcher.tryConvert(input, inDate);
            if (date != null) {
                return date;
            }
        }
        return null;
    }

    /**
     * 日期格式化
     * @param input 经过DateFormatter格式化后的
     * @return String
     */
    public static String date(DateFormatter input) {
        SimpleDateFormat format = new SimpleDateFormat(input.getFormat());
        return format.format(input.getValue());
    }


}
