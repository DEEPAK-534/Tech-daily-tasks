public class IsPrime {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;

        for (int i = 2; i <=num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && num > 1)
            System.out.println("Yes, " + num + " is a prime number");
        else
            System.out.println("No, " + num + " is not a prime number");
    }
}
