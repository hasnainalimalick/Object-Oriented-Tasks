public class FindPrimeNos {
    public static void primeNos(int limit){
        boolean b;
        for (int i = 2; i < limit ; i++) {
            b = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0){
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        primeNos(30);
    }
}
