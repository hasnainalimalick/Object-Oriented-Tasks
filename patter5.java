public class patter5 {
    public static void patter(){
        int print = 0;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                print++;
                System.out.print(" "+print);

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        patter();
    }
}
