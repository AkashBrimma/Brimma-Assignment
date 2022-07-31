/*19. You are given the following information, but you may prefer to do some research for
        yourself
        ● 1 Jan 1900 was a Monday.
        ● Thirty days has September,
        ● April, June and November.
        ● All the rest have thirty-one,
        ● Saving February alone,
        ● Which has twenty-eight, rain or shine.
        ● And on leap years, twenty-nine.
        ● A leap year occurs on any year evenly divisible by 4, but not on a century
        unless it is divisible by 400.
        How many Sundays fell on the first of the month during the twentieth century (1 Jan
        1901 to 31 Dec 2000)?
        Ans: 171*/

public class Counting_sundays{
    public static void main(String[] args) {
        int day = 4;
        int sundays = 0;
        for(int year = 1901; year <= 2000; year++)
            for(int mon = 1; mon <= 12; mon++) {
                day += days(mon, year);
                if(day%7 == 1)
                    sundays++;
            }
        System.out.println(sundays);
    }
    public static int days(int num, int year) {
        int res = 0;
        int feb = 28;
        if(isLeapYear(year))
            feb = 29;
        switch(num) {
            case 1 : res = 31; break;
            case 2 : res = feb; break;
            case 3 : res = 31; break;
            case 4 : res = 30; break;
            case 5 : res = 31; break;
            case 6 : res = 30; break;
            case 7 : res = 31; break;
            case 8 : res = 31; break;
            case 9 : res = 30; break;
            case 10 : res = 31; break;
            case 11 : res = 30; break;
            case 12 : res = 31; break;
        }
        return res;
    }
    public static boolean isLeapYear(int year) {
        if(year%4 == 0)
            if(year%100 == 0) {
                if(year%400 == 0)
                    return true;
            } else
                return true;
        return false;
    }
}
