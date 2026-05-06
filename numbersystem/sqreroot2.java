public class sqreroot2 {
    public static void main(String[] args) {
        double n = 10;
        System.out.println("square root is:" + root(n));
    }

    static double root(double n) {
        double x = n;
        double root;
        while (true) {
            root = (x + (n / x)) / 2;
            if (Math.abs(root - x) < 0.01) {
                break;
            }
            x = root;
        }
        return root;
    }
}
