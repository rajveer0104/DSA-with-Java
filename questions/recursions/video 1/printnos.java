import java.util.*;

public class printnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt(); 
        System.out.println("n to 1");
        nto1(n);
        System.out.println("1 to n");
        print1ton(n);
    }

    static void nto1(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        nto1(n - 1);
    }

    static void print1ton(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        print1ton(n - 1);
        System.out.println(n);

    }
}
