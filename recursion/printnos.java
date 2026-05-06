public class printnos {
    public static void main(String[] args) {
        printno(1);
    }

    static void printno(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printno(n + 1);
    }
}
