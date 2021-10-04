public class LeapYear {
    public static void leapYear(){
        int year = 2060;
        if (year % 4 == 0)
            System.out.println("Yes leap");
        else System.out.println("Not");
    }

    public static void main(String[] args) {
        leapYear();
    }
}
