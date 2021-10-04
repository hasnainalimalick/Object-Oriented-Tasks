public class PrintPrimeFactors {
    public static void printPrime(int num){
        boolean b = true;
        int i;
        int divisor;
        for (i = 2; i <=num; i++) {
            b = true;
            if (num % i == 0){
                divisor = i;
                for (int j = 2; j < divisor; j++) {
                    if (divisor % j == 0)
                        b = false;

                }
                if (b) {
                    System.out.println(divisor);
                }
            }

        }
    }

    public static void main(String[] args) {
        printPrime(20);
    }
}
