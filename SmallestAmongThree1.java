public class SmallestAmongThree1 {
    public static void smallestAmongThree(int num1, int num2, int num3){
        if (num1 > num2 && num2 > num3)
            System.out.println(num1+" Is greater");
        else if (num1 < num2 && num2 < num3)
            System.out.println(num3+" is greater");
        else System.out.println(num2+" is greater");
    }

    public static void main(String[] args) {
        smallestAmongThree(2, 8, 4);
    }
}
