package Backtracking;

public class UniquePathsIII {
    int nonObsCount = 0;
    int m, n;
    int[] dx = { 0, 0, -1, 1 };
    int[] dy = { 1, -1, 0, 0 };
    int result = 0;

    public int uniquePathsIII(int[][] grid) {
        int x = 0;
        int y = 0;

        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                    // nonObsCount++;
                }
                if (grid[i][j] == 0)
                    nonObsCount++;
            }
        }
        nonObsCount += 1;
        backTrack(grid, x, y, 0);
        return result;

    }

    public void backTrack(int[][] grid, int x, int y, int count) {

        if (x < 0 || y < 0 || x >= m || y >= n || grid[x][y] == -1)
            return;

        if (grid[x][y] == 2) {
            if (count == nonObsCount)
                result++;
            return;
        }
        grid[x][y] = -1;
        // count++;

        for (int a = 0; a < 4; a++) {
            int new_x = x + dx[a];
            int new_y = y + dy[a];
            backTrack(grid, new_x, new_y, count + 1);

        }
        grid[x][y] = 0;
    }
}
