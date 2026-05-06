import java.util.*;

public class sumof_nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n) {
        if (n == 1) {
            return n;
        }
        return n + sum(n - 1);
    }
}
