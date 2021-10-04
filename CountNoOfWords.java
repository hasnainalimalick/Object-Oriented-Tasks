public class CountNoOfWords {
    public static void count(){
        String s = "hasnain ali abbas";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==  ' '){
                count++;

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        count();
    }
}
