
import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";
        permu("", s);
        System.out.println();
        // System.out.println(permu2("", s));
        ArrayList<String> hi = new ArrayList<>();
        hi = permu2("", s);
        System.out.println(hi);
        System.out.println("size:" + hi.size());

    }

    static void permu(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permu(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> permu2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < p.length() + 1; i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permu2(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
