public class ReverseInteger {
    public static void main(String[] args) {
        int a = 345;
        while (a > 0){
            int lastDigit = a % 10;
            a = a/10;
            System.out.print(lastDigit);
        }
    }
}
