import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ConvertStrToTime {
    public static void main(String[] args) {
        String time = "May 1, 2016";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate ld = LocalDate.parse(time, dtf);
        System.out.println(ld);
    }
}
