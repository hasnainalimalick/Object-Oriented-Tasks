import org.w3c.dom.ls.LSOutput;

import java.time.Year;
import java.time.YearMonth;

public class InformationOfCurrentYear {
    public static void main(String[] args) {


        Year y = Year.now();
        System.out.println(y.isLeap());
        System.out.println(y.length());

    }
}
