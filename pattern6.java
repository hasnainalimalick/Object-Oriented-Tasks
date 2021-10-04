public class pattern6 {
    public static void patter(){
        int m = 7;
        for (int i = 0; i < 8; i++) {
            for (int j = m; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("**");
            }
            m--;
            System.out.println();


        }
        m = 0;
        for (int i = 7; i >=  0; i--) {
            for (int j = 0; j <= m ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("**");
            }
            m++;
            System.out.println();


        }





    }

    public static void main(String[] args) {
        patter();
    }
}
