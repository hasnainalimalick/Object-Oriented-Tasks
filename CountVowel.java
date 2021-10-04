public class CountVowel {
    public static void countVowel(){
        String s = "hasnain";
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'e')
                count ++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countVowel();
    }
}
