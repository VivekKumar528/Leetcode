class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[1001][1001];
        // for(int[] arr : dp) Arrays.fill(arr, -1);
        int len = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=1;i<=len;i++){
            for(int j=1;j<=len;j++){
                if(s.charAt(i-1) == rev.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[len][len];        
    }
}