import java.util.*;

public class no_of_setbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("no of set bits:" + count);
    }
}
