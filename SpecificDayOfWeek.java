import java.util.Calendar;

public class SpecificDayOfWeek {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

    }
}
