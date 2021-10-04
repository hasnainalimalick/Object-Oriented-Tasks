import java.time.LocalDate;
import java.time.Period;

public class DiffBetTwoDates {
    public static void main(String[] args) {
        LocalDate ldOld = LocalDate.of(2016, 4, 4);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(ldOld, now);
        System.out.println(diff.getYears());
        System.out.println(diff.getMonths());
        System.out.println(diff.getDays());
    }
}
