public class arrayProgram {
    public static void main(String[] args) {
        float[] marks = {33.2f, 22.4f, 90.0f, 55.0f, 24.5f};
        float num = 22.4f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present is the array");

        } else {
            System.out.println("the value is not present in the array");
        }
    }
}