public class Table {
    public static void main(String[] args) {
       
        int n = 5;

        // Using for loop
        System.out.println("Multiplication Table using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        // Using while loop
        System.out.println("\nMultiplication Table using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        // Using do-while loop
        System.out.println("\nMultiplication Table using do-while loop:");
        int j = 1;
        do {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        } while (j <= 10);
    }
}