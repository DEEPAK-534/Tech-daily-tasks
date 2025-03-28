public class Discount{
    public static double calculateFinalPrice(double cartValue) {
        if (cartValue > 500) return cartValue * 0.8;
        if (cartValue >= 100) return cartValue * 0.9;
        return cartValue;
    }

    public static void main(String[] args) {
        double finalPrice = calculateFinalPrice(550);
        System.out.println("Final Price: $" + finalPrice);
    }
}