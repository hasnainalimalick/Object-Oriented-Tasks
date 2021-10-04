public class GreatestNum {
    public static void greatest(){
        int num1 = 55, num2 = 13, num3 = 111;
        if (num1 > num2 && num1 > num3)
            System.out.println(num1);
        else if(num2 > num1 && num2 > num3)
            System.out.println(num2);
        else
            System.out.println(num3);

    }

    public static void main(String[] args) {
        greatest();
    }
}
