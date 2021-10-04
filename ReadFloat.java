import java.util.Scanner;

public class ReadFloat {
    public static void readFloat(){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        if (f < 0)
            System.out.println("Negative and small");
        if (f >= 0)
            System.out.println("positive");
        if (f > 1000000)
            System.out.println("large");
    }

    public static void main(String[] args) {
        readFloat();
    }
}
