
import java.time.*;
public class GetTheInformationOfTIme{
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(12, 24, 32);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("\nCurrent Local time: " + time);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " +second+"\n");
    }

}
