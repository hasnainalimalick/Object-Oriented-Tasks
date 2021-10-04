public class CheckFinite {
    public static void main(String[] args) {
        double d1 = 27384.464646463733;
        boolean d2 = Double.isFinite(d1);
        System.out.println(d2);
        float f = 2.4567899877666f;
        boolean b = Double.isFinite(f);
        System.out.println(b);
    }
}
