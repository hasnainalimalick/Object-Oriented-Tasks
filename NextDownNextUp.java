public class NextDownNextUp {
    public static void main(String[] args) {
        float f = 0.30f;
        float next = Math.nextUp(f);
        float down = Math.nextDown(f);
        System.out.println(f);
        System.out.println(next);
        System.out.println(down);
    }
}
