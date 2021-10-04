public class ConvertMintoDaysAndYears {
    public static void main(String[] args) {
        int minutes = 3456789;
        int hour = 3456789/60;
        int days = hour/24;
        int day = days % 365;
        int year = days/365;
        System.out.println(day);
        System.out.println(year);

    }
}
