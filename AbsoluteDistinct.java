import java.util.HashSet;

public class AbsoluteDistinct {
    public static void main(String[] args) {
        int count = 0;
        int[] array = {1, 2, 3, 3, 3, 4, 5, 6, 7};
        HashSet hs = new HashSet();
        for (int i = 0; i < array.length; i++) {
            int n = Math.abs(array[i]);
            if (!hs.contains(n)){
                count++;
                hs.add(n);
            }
        }
        System.out.println(count);
    }
}
