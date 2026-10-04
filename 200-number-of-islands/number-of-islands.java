class Solution {
    public void dfs(int i, int j, boolean[][] vis, char[][] arr) {
        vis[i][j] = true;
        if (i > 0 && arr[i - 1][j] == '1' && !vis[i - 1][j])
            dfs(i - 1, j, vis, arr); // up
        if (i + 1 < arr.length && arr[i + 1][j] == '1' && !vis[i + 1][j])
            dfs(i + 1, j, vis, arr); // down
        if (j + 1 < arr[0].length && arr[i][j + 1] == '1' && !vis[i][j + 1])
            dfs(i, j + 1, vis, arr); // right
        if (j > 0 && arr[i][j - 1] == '1' && !vis[i][j - 1])
            dfs(i, j - 1, vis, arr); //left
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    dfs(i, j, vis, grid);
                    count++;
                }
            }
        }

        return count;
    }
}