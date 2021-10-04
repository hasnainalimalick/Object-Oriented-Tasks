public class CountNosWithoutSeven {
    public static void main(String[] args) {
        int a = 60;
        int count = 1;
        int temp = 0;
        for (int i = 1; i < a; i++) {
            for (int j = i; j > 0;) {
                temp = j % 10;
                j = j / 10;
                if (temp != 7 && j != 7)
                    count++;
                break;
            }

        }
        System.out.println(count);
    }
}

