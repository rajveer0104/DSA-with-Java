import java.util.*;

public class magicno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
