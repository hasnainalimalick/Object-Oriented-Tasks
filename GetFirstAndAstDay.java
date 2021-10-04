import java.time.YearMonth;
import java.util.Calendar;

public class GetFirstAndAstDay {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.of(2021, 8);
        String firDay = ym.atDay(1).getDayOfWeek().name();
        String LastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firDay);
        System.out.println(LastDay);
    }
}
