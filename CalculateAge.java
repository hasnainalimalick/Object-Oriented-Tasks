import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1998, 4, 15);
        LocalDate now = LocalDate.now();
        Period age = Period.between(dob, now);
        System.out.println("Your age is = "+age.getYears()+" Years: "+ age.getMonths()+" Days: and "+age.getDays()+" Days");
    }
}
