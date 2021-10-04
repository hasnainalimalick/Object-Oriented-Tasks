import java.util.Scanner;

public class Read5AndSumAndAverage {
    public static void read5andAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        double average = (num1 + num2 + num3 + num4 + num5)/5;
        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("This is average "+average);
        System.out.println("this is sum "+sum);
    }

    public static void main(String[] args) {
        read5andAverage();
    }
}
