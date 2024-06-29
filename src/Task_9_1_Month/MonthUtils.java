package Task_9_1_Month;

public class MonthUtils {

    public final static Month[] months = {new Month("January", "31", "22"),
            new Month("February", "28", "20"),
            new Month("March", "31", "23"),
            new Month("April", "30", "22"),
            new Month("May", "31", "23"),
            new Month("June", "30", "22"),
            new Month("July", "31", "23"),
            new Month("August", "31", "23"),
            new Month("September", "30", "22"),
            new Month("October", "31", "23"),
            new Month("November", "30", "22"),
            new Month("December", "31", "23")
    };

    public static Month[] getAllMonth() {
        return months;
    }

    public static Month[] getFirstQuarter() {
        return new Month[] {months[0], months[1], months[2]};
    }

    public static Month[] getSecondtQuarter() {
        return new Month[] {months[3], months[4], months[5]};
    }

    public static Month[] getThirdtQuarter() {
        return new Month[] {months[6], months[7], months[8]};
    }

    public static Month[] getFourthtQuarter() {
        return new Month[] {months[9], months[10], months[11]};
    }

    public static Month[] getFirstHalfYear() {
        return new Month[] {months[0], months[1], months[2], months[3], months[4], months[5]};
    }

    public static Month[] getLasttHalfYear() {
        return new Month[]{months[6], months[7], months[8], months[9], months[10], months[11]};
    }
}
