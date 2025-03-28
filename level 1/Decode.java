public class Decode {
    private static final int SECRET_KEY = 123456789;

    public static int encode(int number) {
        return number ^ SECRET_KEY;
    }

    public static int decode(int encodedNumber) {
        return encodedNumber ^ SECRET_KEY;
    }

    public static void main(String[] args) {
        int number = 12345;

        int encoded = encode(number);
        System.out.println("Encoded: " + encoded);

        int decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}