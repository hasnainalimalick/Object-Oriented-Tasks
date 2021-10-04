import java.util.Calendar;

public class GetNoOfDays {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
