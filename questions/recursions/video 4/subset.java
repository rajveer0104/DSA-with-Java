import java.util.ArrayList;
import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String arr = sc.nextLine();

        ArrayList<String> a = new ArrayList<>();
        System.out.println(subset("", arr, a));

        subset1("", arr);
        System.out.println();
        subset_ascii("", arr);

    }

    static ArrayList<String> subset(String p, String up, ArrayList a) {
        if (up.isEmpty()) {
            a.add(p);
            return a;
        }
        char ch = up.charAt(0);
        subset(p + ch, up.substring(1), a);
        subset(p, up.substring(1), a);
        return a;
    }

    static void subset1(String p, String up) {
        if (up.isEmpty()) {
            System.out.print("[" + p + "]");
            return;
        }
        char ch = up.charAt(0);
        subset1(p + ch, up.substring(1));
        subset1(p, up.substring(1));
    }

    static void subset_ascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.print("[" + p + "]");
            return;
        }
        char ch = up.charAt(0);
        subset_ascii(p + ch, up.substring(1));
        subset_ascii(p, up.substring(1));
        subset_ascii(p + (ch + 0), up.substring(1));
    }
}
