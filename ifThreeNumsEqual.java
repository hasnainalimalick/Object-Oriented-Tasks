public class ifThreeNumsEqual {
    public static void numsEqual(){
        int num1 = 234;
        int num2 = 345;
        int num3 = 876;
        if (num1 == num2 && num2 == num3)
            System.out.println("Equals");
        else System.out.println("Not Equal");
    }

    public static void main(String[] args) {
        numsEqual();
    }
}
