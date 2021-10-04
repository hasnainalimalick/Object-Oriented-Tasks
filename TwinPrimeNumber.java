public class TwinPrimeNumber {
    public static void twin (){
        boolean b;
        int previousPrime = 0;
        int currentPrime = 0;
        int temp = 3;
        int two = 2;
        for (int i = 4; i < 100; i++) {
            b = true;
            for (int j = 2; j < i;  j++) {
                if (i % j == 0)
                    b = false;
            }
            if (b){
                if (i == temp+2 )
                    System.out.println(temp+" "+i);
                temp = i;

            }

        }
    }

    public static void main(String[] args) {
        twin();
    }
}
