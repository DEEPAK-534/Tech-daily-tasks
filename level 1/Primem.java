public class Primem {
    public static void main(String[] args) {
        int n = 20;
        int res = 0, c = 0; 

        for (int i = 2; i < n; i++) {
            if (isprime(i)) {  
                res += i;  
                if (res > 3 && res < 20 && isprime(res) ){
                    c++;  
                }
            }
        }

        System.out.println(c);  
    }

    public static boolean isprime(int n) {
        if (n == 2) {  
            return true;
        }
        if (n < 2 || n % 2 == 0) { 
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
