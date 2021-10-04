public class BreakDigit {
    public static void main(String[] args) {
        int r = 0;
        int num = 345;
        int digit = 0;
        while (num > 0){
            digit = num % 10;
            r = r * 10 + digit;
            num = num / 10;

        }
        while (r > 0){
            digit = r % 10;
            num = num * 10 + digit;
            r = r / 10;
            System.out.println(digit);
        }
    }
}
