public class BodyMassIndex {
    public static void main(String[] args) {
        int weight = 452;
        int inches = 72;
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println(BMI);
    }
}
