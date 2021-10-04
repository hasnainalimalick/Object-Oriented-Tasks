import java.util.Scanner;

public class Int15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1");
        int num1 = sc.nextInt();
        System.out.println("Enter no 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int diff = Math.abs(num1 - num2);
        boolean b = true;
        if (num1 == 15 || num2 == 15){
            System.out.println(b);
        }
        else if (sum == 15){
            System.out.println(b);
        }
        else if (diff == 15)
            System.out.println(b);
        else System.out.println("false");
    }
}
