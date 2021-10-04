import java.util.Scanner;

public class NByNMatrix {
    public static void matrix(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        matrix();
    }
}
