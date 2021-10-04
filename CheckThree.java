public class CheckThree {
    public static void checkThreeNos(){
        int num1 = 123, num2 = 567, num3 = 888;
        if (num1 > num2 && num2 > num3)
            System.out.println("Increasing");
         else if (num1 < num2 && num2 < num3)
            System.out.println("Increasing");
         else System.out.println("Neither increasing, Nor Decreasing");
    }

    public static void main(String[] args) {
        checkThreeNos();
    }
}
