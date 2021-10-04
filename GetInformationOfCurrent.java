import java.time.LocalDate;
import java.time.Month;

public class GetInformationOfCurrent {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        Month mn = ld.getMonth();
        int lengtOfTheMonth = mn.minLength();
        int lengtOfTheMonth1 = mn.maxLength();
        int value = mn.getValue();
        Month firstMonthOfQuarter = mn.firstMonthOfQuarter();
        System.out.println(lengtOfTheMonth);
        System.out.println(lengtOfTheMonth1);
        System.out.println(value);
        System.out.println(firstMonthOfQuarter);



    }
}
