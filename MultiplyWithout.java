import java.util.*;
public class MultiplyWithout {
    public static int multiply_two_nums(int a, int b) {

        /* 0 multiplied with anything gives 0 */
        if (b == 0)
            return 0;

        if (b > 0)
            return (a + multiply_two_nums(a, b - 1));

        if (b < 0)
            return -multiply_two_nums(a, -b);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = 3;
        int num2 = 3;
        scan.close();
        System.out.println("Multiply of two integers: "+multiply_two_nums(num1, num2));
    }
}
