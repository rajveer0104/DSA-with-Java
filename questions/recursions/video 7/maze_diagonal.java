import java.util.ArrayList;

public class maze_diagonal {
    public static void main(String[] args) {
        System.out.println("no. of ways=" + count(3, 3));
        ArrayList ans = new ArrayList<>();
        ans = path_diag("", 3, 3);
        System.out.println(ans);

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int corner = count(r - 1, c - 1);
        int down = count(r - 1, c);
        int right = count(r, c - 1);
        return down + right + corner;
    }

    static ArrayList<String> path_diag(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(path_diag(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(path_diag(p + "R", r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(path_diag(p + "C", r - 1, c - 1));
        }
        return list;
    }
}
