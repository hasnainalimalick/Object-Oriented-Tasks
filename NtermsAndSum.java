import java.util.Scanner;

public class NtermsAndSum {
    public static void termsAndSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n terms");
        int terms = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= terms ; i++) {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum of n term is  "+sum);
    }

    public static void main(String[] args) {
        termsAndSum();
    }
}
