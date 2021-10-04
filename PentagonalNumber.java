public class PentagonalNumber {
    public static void pentagona(){
        for (int i = 0; i <= 50; i++) {
            System.out.println((i*(3 * i - 1))/2);
        }
    }

    public static void main(String[] args) {
        pentagona();
    }
}
