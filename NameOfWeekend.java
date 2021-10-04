import java.util.Scanner;

public class NameOfWeekend {
    public static void nameOfWeekend(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        nameOfWeekend();
    }
}
