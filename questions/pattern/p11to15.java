import java.util.*;

public class p11to15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        // p11(n);p12(n);p13(n);p14(n);p15(n);
        p15(n);
    }

    static void p11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == n - 1) {
                for (int l = 0; l < 2 * i; l++) {
                    System.out.print("*");
                }
            }
            if (i > 0 && i < n - 1) {
                for (int m = 0; m < 2 * i - 1; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void p14(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i == 0) {
                for (int j = 0; j < 2 * n - 2; j++) {
                    System.out.print("*");
                }
            }
            if (i > 0 && i < n - 1) {
                for (int m = 0; m < -2 * i + 7; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void p15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0) {
                for (int m = 0; m < 2 * i - 1; m++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i < n - 2) {
                for (int k = 0; k < n - 2 * i; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}