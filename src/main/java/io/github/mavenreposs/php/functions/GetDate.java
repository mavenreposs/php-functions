package io.github.mavenreposs.php.functions;

public class GetDate {
    private int seconds;
    private int minutes;
    private int hours;
    private int mday;
    private int wday;
    private int mon;
    private int year;
    private int yday;
    private String weekday;
    private String month;
    private int time;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMday() {
        return mday;
    }

    public void setMday(int mday) {
        this.mday = mday;
    }

    public int getWday() {
        return wday;
    }

    public void setWday(int wday) {
        this.wday = wday;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYday() {
        return yday;
    }

    public void setYday(int yday) {
        this.yday = yday;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "GetDate{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                ", mday=" + mday +
                ", wday=" + wday +
                ", mon=" + mon +
                ", year=" + year +
                ", yday=" + yday +
                ", weekday='" + weekday + '\'' +
                ", month='" + month + '\'' +
                ", time=" + time +
                '}';
    }
}
