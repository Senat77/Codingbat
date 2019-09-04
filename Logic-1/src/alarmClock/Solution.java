package alarmClock;

/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00"
and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and
weekends it should be "off".

alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
    }

    private static String alarmClock(int day, boolean vacation) {
        boolean isWeekday = day > 0 && day < 6;
        if (isWeekday) {
            if (vacation)
                return "10:00";
            else
                return "7:00";
        }
        else
        {
            if (vacation)
                return "off";
            else
                return "10:00";
        }
    }
}