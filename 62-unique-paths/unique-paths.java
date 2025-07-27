class Solution {
    public int solve(int row, int col, int m, int n, int[][] dp){
        if(row >= m || col >= n) return 0;
        if(row == m-1 && col == n-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int rightWays = solve(row, col+1, m, n, dp);
        int downWays = solve(row+1, col, m, n, dp);
        return dp[row][col] = rightWays + downWays;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] ele : dp) Arrays.fill(ele, -1);
        return solve(0, 0, m, n, dp);
    }
}