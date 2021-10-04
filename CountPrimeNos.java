public class CountPrimeNos {
    public static void main(String[] args) {
        int num = 25;
        int count = 0;
        boolean b = true;
        for (int i = 2; i < num; i++) {
            b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    b = false;
                }
            }
            if (b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
