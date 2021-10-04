import java.util.Scanner;

public class CheckInteger {
    public static void checkInt(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0){
            System.out.println("Number is pos");
        }
        else if (num < 0){
            System.out.println("num is neg");
        }
        else System.out.println("Num is zero");
    }

    public static void main(String[] args) {
        checkInt();
    }
}
