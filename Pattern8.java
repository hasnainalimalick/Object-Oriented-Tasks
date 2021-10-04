public class Pattern8 {
    public static void pattern(){
        int space = 0;

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= space ; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >= 0 ; j--) {
                System.out.print("*");
            }
            space++;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
