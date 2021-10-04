import java.util.Calendar;
import java.util.Date;

public class DateBeforAndAfterOneYear {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        Calendar c1 = Calendar.getInstance();
        c.add(Calendar.YEAR, 1);
        Date d2 = c1.getTime();
        Calendar c2 = Calendar.getInstance();
        c.add(Calendar.YEAR, -2);
        Date d3 = c2.getTime();
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);


    }
}
