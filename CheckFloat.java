import java.util.Scanner;

public class CheckFloat {
    public static void checkFloat(){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        if (f > 0){
            System.out.println("num is pos and large");
        }
        else if (f < 0){
            System.out.println("NUm is neg and small");
        }
        else System.out.println("Num is zero");
    }

    public static void main(String[] args) {
        checkFloat();
    }
}
