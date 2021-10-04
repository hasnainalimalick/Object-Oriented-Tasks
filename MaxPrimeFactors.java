public class MaxPrimeFactors {
    public static void primeNos(int start, int end){
        boolean b;
        int count = 0;
        int temp = 0;
        int number = 0;
        for (int i = start; i < end ; i++) {
            count = 0;
            System.out.print("the divisor of "+i);
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count ++;
                    System.out.print(" "+j);
                    System.out.println();


                }
            }
            if (temp < count) {
                temp = count;
                number = i;

            }

        }
        System.out.println("The maximum are "+temp);
        System.out.println("the number is "+number);
    }

    public static void main(String[] args) {
        primeNos(2, 25);
    }
}
