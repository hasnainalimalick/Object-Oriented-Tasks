import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TimeBetTwoDates {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2016, Month.NOVEMBER, 12);
        Period diff = Period.between(ld2, ld1);
        System.out.println(diff.getMonths());
        System.out.println(diff.getYears());
    }
}
