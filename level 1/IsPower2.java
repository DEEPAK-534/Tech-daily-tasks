public class IsPower2 {
    public static void main(String[] args) {
        int num = 16;
        if ((num & (num - 1)) == 0) {
            System.out.println("Yes, it is a power of two");
        } else {
            System.out.println("No, it is not a power of two");
        }
    }
}