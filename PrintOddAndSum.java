import java.util.Scanner;

public class PrintOddAndSum {
    public static void printOddAndSum(){
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int num2 = 1;
        int sum = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(num2);
            sum = sum + num2;
            num2 = num2 + 2;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printOddAndSum();
    }
}
