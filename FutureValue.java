public class FutureValue {
    public static void futureValue(){
        int investment = 1000;
        int interestInPercent = 10;
        int years = 5;
        double sum = 0;
        for (int i = 0; i < years; i++) {
            sum = sum + investment/0.10;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        futureValue();
    }
}
