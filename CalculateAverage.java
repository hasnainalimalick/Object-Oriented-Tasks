public class CalculateAverage {
    public static void main(String[] args) {
        float[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        float average = sum/ array.length-1;
        System.out.println("Average is "+average);

    }
}
