package io.github.mavenreposs.php.functions.strtotime.matcher;

import io.github.mavenreposs.php.functions.strtotime.Matcher;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 获取传过来的时间的的当前月的第一天0时0分0秒的时间戳
 */
public class FirstDayOfNMonthMatcher implements Matcher {

    private final Pattern days = Pattern.compile("first day of ([\\-\\+]?\\d+) month");

    public FirstDayOfNMonthMatcher() {
    }

    public Date tryConvert(String input, Date date) {
        java.util.regex.Matcher m = days.matcher(input);
        if (m.matches()) {
            int d = Integer.parseInt(m.group(1));
            Calendar calendar = Calendar.getInstance();
            if (date != null) {
                calendar.setTime(date);
            }
            calendar.add(Calendar.MONTH, d);
            calendar.set(Calendar.DAY_OF_MONTH, 1); //设置为1号
            calendar.set(Calendar.HOUR_OF_DAY, 0); //将小时至零
            calendar.set(Calendar.MINUTE, 0); //将分钟至零
            calendar.set(Calendar.SECOND, 0); //将秒至零
            calendar.set(Calendar.MILLISECOND, 0); //将毫秒至零
            return calendar.getTime();
        }
        return null;
    }
}
