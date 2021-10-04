import java.util.Calendar;

public class CurrentTimeDate {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.print("Month "+c.get(Calendar.MONTH));
        System.out.print("  Date "+c.get(Calendar.DATE));
        System.out.print(" YEAR "+c.get(Calendar.YEAR));
        System.out.print(" Hour "+c.get(Calendar.HOUR));
        System.out.print(" Minutes "+c.get(Calendar.MINUTE));
        System.out.println(" Second "+c.get(Calendar.SECOND));
    }
}
