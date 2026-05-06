import java.util.*;

public class factorialno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if (n == 1) {
            return n;
        }
        return n * fact(n - 1);
    }
}
