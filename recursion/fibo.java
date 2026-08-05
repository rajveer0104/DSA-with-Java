public class fibo {
    public static void main(String[] args) {
        System.out.println(fibon(5));
    }

    static int fibon(int n) {
        if (n < 2) {
            return n;
        }
        int x=fibon(n - 1) + fibon(n - 2);
        System.out.println(x);
        return x;
    }
}
