import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int no_of_dig = nod(n);
        System.out.println(rev(n, no_of_dig));
        if (n == rev(n, no_of_dig)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

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
    }
}
