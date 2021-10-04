public class Pattern9 {
    public static void pattern(){
        int space = 7;
        for (int i = 0; i <= 6; i++) {
            for (int j = space; j >= 0 ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");

            }
            System.out.println();
            space--;
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
