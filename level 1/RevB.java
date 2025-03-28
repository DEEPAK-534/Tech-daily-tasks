public class RevB {
    public static void main(String[] args) {
        int num = 5; // 0000 0101
        int result = Integer.reverse(num);
        System.out.println("Reversed Binary: " + Integer.toBinaryString(result));
        System.out.println("Equivalent Decimal: " + result);
    }
}
