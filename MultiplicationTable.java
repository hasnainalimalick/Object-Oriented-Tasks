import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print table of");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+ num*i);

        }
    }

    public static void main(String[] args) {
        multiplication();
    }
}
