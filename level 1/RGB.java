public class RGB {
    public static int toGrayscale(int r, int g, int b) {
        return (int) ((0.3 * r) + (0.59 * g) + (0.11 * b));
    }

    public static void main(String[] args) {
        int grayscale = toGrayscale(100, 150, 200);
        System.out.println("Grayscale Value: " + grayscale);
    }
}