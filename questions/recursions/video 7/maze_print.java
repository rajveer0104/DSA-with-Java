
public class maze_print {
    public static void main(String[] args) {
        boolean[][] arr = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int[3][3];
        path_obs("", arr, 0, 0, path, 1);
    }

    static void path_obs(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            path[r][c] = step;
            for (int i = 0; i < path.length; i++) {
                for (int j = 0; j < path[0].length; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            path_obs(p + "D", maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            path_obs(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            path_obs(p + "U", maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            path_obs(p + "L", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
