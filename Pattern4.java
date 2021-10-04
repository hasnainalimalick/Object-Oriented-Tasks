public class Pattern4 {
    public static void patter(){
        int s = 2;
        for (int i = 1; i <= 4 ; i++) {
            for (int j = s; j >= 0 ; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+" ");

            }
            System.out.println();
            s--;

        }
    }

    public static void main(String[] args) {
        patter();
    }
}
