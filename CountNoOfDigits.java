import java.util.Scanner;

public class CountNoOfDigits {
    public static void countDigits(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countDigits();
    }
}
