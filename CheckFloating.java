public class CheckFloating {
    public static void checkFloating(){
        float f1 = 20.45f;
        float f2 = 20.44f;
        float f3 = Math.abs(f1 - f2);
        if (f3 < 0.1)
            System.out.println("Equal");
        else System.out.println("Not Equal");



    }

    public static void main(String[] args) {
        checkFloating();
    }
}
