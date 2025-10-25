import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("GCD:" + GCD(a, b));
        System.out.println("LCM:" + LCM(a, b));
    }

    static int GCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return GCD((b % a), a);
    }

    static int LCM(int a, int b) {
        return ((a * b) / GCD(a, b));
    }
}
