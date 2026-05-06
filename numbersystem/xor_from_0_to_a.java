import java.util.*;

public class xor_from_0_to_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("result" + xor0toa(a));
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
