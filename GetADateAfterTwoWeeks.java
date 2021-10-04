import java.util.Calendar;
import java.util.Date;

public class GetADateAfterTwoWeeks {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date cdate = c.getTime();
        c.add(Calendar.DAY_OF_YEAR, 14);
        Date date = c.getTime();
        System.out.println(cdate);
        System.out.println(date);

    }
}
