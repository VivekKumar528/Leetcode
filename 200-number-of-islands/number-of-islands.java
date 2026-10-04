class Solution {
    class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void bfs(int i, int j, char[][] arr, boolean[][] vis) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = true;
        while (!q.isEmpty()) {
            Pair front = q.remove();
            int x = front.x;
            int y = front.y;

            if (x > 0) { // top
                if (!vis[x - 1][y] && arr[x - 1][y] == '1') {
                    q.add(new Pair(x - 1, y));
                    vis[x - 1][y] = true;
                }
            }

            if (x + 1 < arr.length) { // bottom
                if (!vis[x + 1][y] && arr[x + 1][y] == '1') {
                    q.add(new Pair(x + 1, y));
                    vis[x + 1][y] = true;
                }
            }

            if (y > 0) { // left
                if (!vis[x][y - 1] && arr[x][y - 1] == '1') {
                    q.add(new Pair(x, y - 1));
                    vis[x][y - 1] = true;
                }
            }

            if (y + 1 < arr[0].length) { // right
                if (!vis[x][y + 1] && arr[x][y + 1] == '1') {
                    q.add(new Pair(x, y + 1));
                    vis[x][y + 1] = true;
                }
            }
        }
    }

    public int numIslands(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean[][] vis = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == '1' && vis[i][j] != true) {
                    bfs(i, j, arr, vis);
                    count++;
                }
            }
        }
        return count;
    }
}