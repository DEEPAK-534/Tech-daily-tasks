import java.util.*;

public class Choco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i < m-1; i++) {
               int diff = a[i+m - 1] - a[i];
                minDiff = Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}
