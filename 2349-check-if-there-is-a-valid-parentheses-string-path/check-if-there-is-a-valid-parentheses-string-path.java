class Solution {
    public boolean solve(int i, int j, int openBracketCount, int m, int n, char[][] arr, Boolean[][][] t){
        if(i == m || j == n) return false;
        openBracketCount += arr[i][j] == '(' ? 1 : -1;
        if(openBracketCount < 0) return false;
        if(t[i][j][openBracketCount] != null) return t[i][j][openBracketCount];
        if(i == m-1 && j == n-1) return t[i][j][openBracketCount] = openBracketCount == 0;
        boolean down = false;
        boolean right = false;
        if(i+1 < m) down = solve(i+1, j, openBracketCount, m, n, arr, t);
        if(j+1 < n) right = solve(i, j+1, openBracketCount, m, n, arr, t);
        return t[i][j][openBracketCount] = down || right;

    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if((m+n-1) % 2 == 1) return false;
        if(grid[0][0] == ')' || grid[m-1][n-1] == '(') return false;
        Boolean[][][] t = new Boolean[101][101][201];
        return solve(0, 0, 0, m, n, grid, t);
    }
}