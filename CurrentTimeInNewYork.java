import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTimeInNewYork {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in newYork"+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
