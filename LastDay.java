import java.util.Calendar;

public class LastDay {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
