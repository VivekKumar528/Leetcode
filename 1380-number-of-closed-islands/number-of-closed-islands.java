class Solution {

    public boolean dfs(int[][] arr, int r, int c, int m, int n){

        if(r >= m || r < 0 || c >= n || c < 0) return false;

        if(arr[r][c] == 1) return true;
        arr[r][c] = 1; // marking visited

        boolean leftClosed = dfs(arr, r, c-1, m, n);
        boolean rightClosed = dfs(arr, r, c+1, m, n);
        boolean upClosed = dfs(arr, r-1, c, m, n);
        boolean downClosed = dfs(arr, r+1, c, m, n);

        return leftClosed && rightClosed && upClosed && downClosed;
        
    }
    public int closedIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    if(dfs(grid, i, j, m, n) == true) count++;
                }
            }
        }
        return count;
    }
}