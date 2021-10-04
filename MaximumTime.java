import java.util.Calendar;

public class MaximumTime {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int maxYear = c.getActualMaximum(Calendar.YEAR);
        int maxMonth = c.getActualMaximum(Calendar.MONTH);
        int maxWeek = c.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int maxDate = c.getActualMaximum(Calendar.DATE);
        System.out.println(maxDate);
        System.out.println(maxYear);
        System.out.println(maxWeek);
        System.out.println(maxMonth);
    }
}
