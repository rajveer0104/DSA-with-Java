import java.util.*;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        p1(n, 0);
        p2(n, 0, 0);

    }

    static void p1(int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            System.out.print("*");
            p1(i, j + 1);
        } else {
            System.out.println();
            p1(i - 1, 0);
        }
    }

    static void p2(int n, int i, int j) {
        if (i == n) {
            return;
        }
        if (i >= j) {
            System.out.print("*");
            p2(n, i, j + 1);
        } else {
            System.out.println();
            p2(n, i + 1, 0);
        }
    }
}
