import java.util.*;

public class primenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        /*
         * for (int i = 1; i <= n; i++) {
         * if (primeno(i) == true) {
         * System.out.println(i);
         * }
         * }
         */
        boolean[] primes = new boolean[n + 1];
        primeno2(n, primes);
    }

    /*
     * static boolean primeno(int n) {
     * int c = 2;
     * if (n < 1) {
     * return false;
     * }
     * while (c * c <= n) {
     * if (n % c == 0) {
     * return false;
     * }
     * c++;
     * }
     * return true;
     * }
     */

    static void primeno2(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == false) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}
