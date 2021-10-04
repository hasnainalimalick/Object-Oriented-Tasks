import java.util.Scanner;

public class Pattern {
    public static void printPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}
