import java.util.Calendar;

public class DateObject {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int month = 7;
        int date = 19;
        int year = 2021;
        //c.clear();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DATE, date);
        System.out.println(c.getTime());
    }
}
