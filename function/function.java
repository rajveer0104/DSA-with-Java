import java.util.*;

public class function {
    public static void main(String[] args) {
        // NRNA
        sum();
        // NRHA
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        sum2(c, d);
        sc.close();
        // HRNA
        int r = sum3();
        System.out.println("sum=" + r);
        System.out.println("sum is" + sum3());
        // HRHA
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int r1 = sum4(c1, d1);
        System.out.println("sum=" + r1);
        System.out.println("sum=" + sum4(c1, d1));
    }

    // NRNA
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum=" + c);
        sc.close();
    }

    // NRHA
    static void sum2(int a, int b) {
        int c = a + b;
        System.out.println("sum=" + c);
    }

    // HRNA
    static int sum3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        sc.close();
        return c;

    }

    // HRHA
    static int sum4(int a, int b) {
        int c = a + b;
        return c;
    }
}
