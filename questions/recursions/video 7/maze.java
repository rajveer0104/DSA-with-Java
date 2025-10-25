
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        System.out.println("no. of ways=" + count(3, 3));
        path("", 3, 3);
        ArrayList ans = new ArrayList<>();
        ans = path2("", 3, 3);
        System.out.println(ans);

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + "D", r - 1, c);
        }
        if (c > 1) {
            path(p + "R", r, c - 1);
        }
    }

    static ArrayList<String> path2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(path2(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(path2(p + "R", r, c - 1));
        }
        return list;
    }
}
/*
 * here put the values of r and c acc to the target position wheere u want to
 * reach
 * eg. 3 2 1
 * 2
 * 1
 * eg if want to go to (1,1) then r=1,c=1
 */