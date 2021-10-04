public class BionomialCoofficient {
    public static int factOfOne(int num1){
        if (num1 == 1)
            return 1;
        return num1 * factOfOne(num1 - 1);

        }


    public static void main(String[] args) {
        int num1 = factOfOne(7);
        int num2 = factOfOne(3);
        int num3 = factOfOne(4);
        System.out.println("Bionomial Coooficient of two numbers are "+ num1/(num2*(num3)));
    }
    }

