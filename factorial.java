public class factorial {
    public static void main(String[] args) {
        int num = 5;
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
