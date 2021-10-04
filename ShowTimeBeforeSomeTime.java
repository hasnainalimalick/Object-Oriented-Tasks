import java.time.LocalDateTime;

public class ShowTimeBeforeSomeTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now().minusHours(5).minusMinutes(40);
        System.out.println(LocalDateTime.now());
        System.out.println(ldt);
    }
}
