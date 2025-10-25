
import java.util.ArrayList;

public class phoneno_pad {
    public static void main(String[] args) {
        // void
        pad("", "89");
        System.out.println();
        // arraylist with 2 arguments
        ArrayList<String> hi = new ArrayList<>();
        hi = pad2("", "79");
        System.out.println(hi);
        // arraylist with 1 argument
        ArrayList<String> fin = new ArrayList<>();
        fin = pad3("73");
        System.out.println(fin);

    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0) - '0';
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                pad(p + ch, up.substring(1));
            }
        }
    }

    static ArrayList<String> pad2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        if (digit == 7) {
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad2(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad2(p + ch, up.substring(1)));
            }
        } else if (digit == 9) {
            for (int i = ((digit - 2) * 3) + 1; i < ((digit - 1) * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad2(p + ch, up.substring(1)));
            }
        } else {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad2(p + ch, up.substring(1)));
            }
        }
        return ans;
    }

    static ArrayList<String> pad3(String dig) {
        ArrayList<String> str = pad2("", dig);
        return str;
    }
}
