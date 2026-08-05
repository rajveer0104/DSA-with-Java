import java.util.ArrayList;
import java.util.Comparator;

public class factors_ofa_no {
    public static void main(String[] args) {
        int n = 24;
        factors(n);
    }

    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    list.add(i);
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                    list.add(i);
                    
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println("This is getting printed");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
