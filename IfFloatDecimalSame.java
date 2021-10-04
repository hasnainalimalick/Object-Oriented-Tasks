import java.util.Scanner;

public class IfFloatDecimalSame {
    public static void floateSame(){
        Scanner sc = new Scanner(System.in);
        float f1 = 23.4f;
        float f2 = 23.4f;
        float afterDecimal1 = f1 % 1;
        float afterDecimal2 = f2 % 1;
        if (afterDecimal1 == afterDecimal2)
            System.out.println("Yes equal");
        else System.out.println("Not equal");
    }

    public static void main(String[] args) {
        floateSame();
    }
}
