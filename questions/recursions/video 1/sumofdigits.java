import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        System.out.println(sumofdig(n));
        System.out.println(productofdig(n));
    }

    static int sumofdig(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return (n % 10 + sumofdig(n / 10));
    }

    static int productofdig(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return (n % 10 * productofdig(n / 10));
    }
}
