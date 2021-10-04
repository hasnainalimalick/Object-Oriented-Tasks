public class IntToBin {
    public static void main(String[] args) {
        int input = 12546455 ;
        int count = 0;
        int temp = 0;
        String result = Integer.toBinaryString(input);
        hasnain:
        for (int i = 0; i < result.length() - 1; i++) {
            for (int j = i; j < result.length(); j++) {
                if (result.charAt(i) == '0' && result.charAt(i + 1) == '0') {
                    count = count + 1;
                    continue hasnain;
                }
            }
            if (temp < count) {
                temp = count;
                count = 0;
            }

        }

        System.out.println(temp + 1);
}


}
