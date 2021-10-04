import java.util.Scanner;

public class QuadraticEquations {
    public static void quadraticEquation(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double root1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        double root2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        System.out.println(root1);
        System.out.println(root2);
    }

    public static void main(String[] args) {
        quadraticEquation();
    }
}
