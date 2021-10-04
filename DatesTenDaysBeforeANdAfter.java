import java.util.Calendar;
import java.util.Date;

public class DatesTenDaysBeforeANdAfter {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 10);
        Date d = c.getTime();
        c.add(Calendar.DATE, -20);
        Date d2 = c.getTime();
        System.out.println(d);
        System.out.println(d2);

    }
}
