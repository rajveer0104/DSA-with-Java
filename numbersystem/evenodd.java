import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println(isodd(n));
    }

    static boolean isodd(int n) {
        return (n & 1) == 1;
    }
}
