import java.util.ArrayList;

public class maze_allpaths {
    public static void main(String[] args) {
        boolean[][] arr = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        ArrayList<String> ans = new ArrayList<>();
        ans = path_obs("", arr, 0, 0);
        System.out.println(ans);
    }

    static ArrayList<String> path_obs(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (maze[r][c] == false) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        maze[r][c] = false;
        ArrayList<String> list = new ArrayList<>();
        if (r < maze.length - 1) {
            list.addAll(path_obs(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(path_obs(p + "R", maze, r, c + 1));
        }
        if (r > 0) {
            list.addAll(path_obs(p + "U", maze, r - 1, c));
        }
        if (c > 0) {
            list.addAll(path_obs(p + "L", maze, r, c - 1));
        }
        maze[r][c] = true;
        return list;
    }
}
