public class ATM {
    public static void withdrawCash(int amount) {
        if (amount % 100 != 0) {
            System.out.println("Invalid amount! Must be a multiple of 100.");
            return;
        }

        int notes2000 = amount / 2000;
        amount %= 2000;
        int notes500 = amount / 500;
        amount %= 500;
        int notes100 = amount / 100;

        System.out.println("2000 notes " + notes2000);
        System.out.println("500 notes " + notes500);
        System.out.println("100 notes " + notes100);
    }

    public static void main(String[] args) {
        withdrawCash(3700);
    }
}