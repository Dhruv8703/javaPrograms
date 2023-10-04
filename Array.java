public class Array {
    public static void main(String[] args) {
        float[] marks = {33.2f, 22.4f, 90.0f, 55.0f, 24.5f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("the sum is "+sum);
    }
}
