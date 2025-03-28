public class FibDW {
    public static void main(String[] args) {
        int n = 5;
        int a = 0, b = 1, count = 0;

        System.out.print("Fibonacci Series: ");
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < n);
    }
}