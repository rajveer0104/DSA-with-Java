import java.util.*;

public class xor_from_a_to_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int extra = xor0toa(a - 1);
        int total = xor0toa(b);
        System.out.println("result:" + (extra ^ total));

    }

    static int xor0toa(int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return (a + 1);
        }
        return 0;
    }
}
