import java.time.LocalTime;

public class AddSomeHours {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now().plusHours(4);
        System.out.println(lt);
    }
}
