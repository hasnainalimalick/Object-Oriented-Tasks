import java.util.Scanner;

public class CubeUptoNterms {
    public static void cube() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n terms");
        int terms = sc.nextInt();
        for (int i = 1; i < terms; i++) {
            System.out.println("Number is " + i + " cubue of " + i + "is " + i * i * i);
        }


    }

    public static void main(String[] args) {
        cube();
    }
}
