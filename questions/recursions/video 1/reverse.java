import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int no_of_dig = nod(n);
        System.out.println(rev(n, no_of_dig));

    }

    static int nod(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c - 1;
    }

    static int rev(int n, int nod) {
        if (n / 10 == 0) {
            return n;
        }
        return n % 10 * (int) Math.pow(10, nod) + rev(n / 10, nod - 1);
        // (4*1000+3*100+2*10+1*1)
    }
}
