public class CheckFabonacci {
    public static void fabonacci(){
        int num1 = 0;
        int previous = 1;
        int next;
        int temp;
        int target = 55;
        for (int i = 0; i < 50; i++) {
            next = num1 + previous;
            if (next == target)
                System.out.println(true);
            num1 = previous;
            previous = next;


        }
    }

    public static void main(String[] args) {
        fabonacci();
    }

}
