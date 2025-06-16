class Solution {
    public int solve(String str, int i, int j, int[][] dp){
        if(i > j) return 0;
        if( i == j) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        if(str.charAt(i) == str.charAt(j)){
            return dp[i][j] = 2 + solve(str, i+1, j-1, dp);
        } else {
            return dp[i][j] = Math.max(solve(str, i+1, j, dp), solve(str, i, j-1, dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[1001][1001];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return solve(s, 0, s.length()-1, dp);
    }
}