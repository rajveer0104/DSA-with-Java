import java.util.*;

public class countzeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int c = 0;
        System.out.println(count(n, c));
    }

    static int count(int n, int c) {
        if (n / 10 == 0) {
            return c;
        }
        if (n % 10 == 0) {
            return count(n / 10, c + 1);
        } else {
            return count(n / 10, c);
        }
    }
}
