import java.util.Calendar;

public class MinimumValue {
        public static void main(String[] args) {
            Calendar c = Calendar.getInstance();
            int maxYear = c.getActualMinimum(Calendar.YEAR);
            int maxMonth = c.getActualMinimum(Calendar.MONTH);
            int maxWeek = c.getActualMinimum(Calendar.WEEK_OF_YEAR);
            int maxDate = c.getActualMinimum(Calendar.DATE);
            System.out.println(maxDate);
            System.out.println(maxYear);
            System.out.println(maxWeek);
            System.out.println(maxMonth);
        }
    }
