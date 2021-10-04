import java.util.Scanner;

public class CalculatePower {
    public static void calculatePower(int base, int exponent) {
        int temp = 1;
        for (int i = 1; i <= exponent; i++) {
            temp = temp*base;
        }
        System.out.println(temp);
    }





    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        calculatePower(base, exponent);

    }
}
