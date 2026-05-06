import java.util.*;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int base = sc.nextInt();
        System.out.println("enter power");
        int power = sc.nextInt();
        int ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println("answer:" + ans);
    }
}
