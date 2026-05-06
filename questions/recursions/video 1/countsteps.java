import java.util.*;

public class countsteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int c = 0;
        System.out.println("steps: " + steps(n, c));
    }

    static int steps(int n, int c) {
        if (n == 1) {
            c++;
            return c;
        }
        if (n % 2 == 0) {
            return steps(n / 2, c + 1);
        } else {
            return steps(n - 1, c + 1);
        }
    }
}
