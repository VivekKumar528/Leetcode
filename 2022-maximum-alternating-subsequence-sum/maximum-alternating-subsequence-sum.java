class Solution {
    public long solve(int idx, int[] arr, boolean isEven, long[][] dp){
        if(idx == arr.length) return 0;
        if(dp[idx][isEven ? 1 : 0] != -1) return dp[idx][isEven ? 1 : 0];
        long skip = solve(idx+1, arr, isEven, dp);
        int val = arr[idx];
        if(!isEven){
            val = -val;
        }
        long take = solve(idx+1, arr, !isEven,dp) + val;
        return dp[idx][isEven ? 1: 0] = Math.max(skip, take);
    }
    public long maxAlternatingSum(int[] arr) {
        long[][] dp = new long[arr.length+1][2];
        for(long[] ele : dp) Arrays.fill(ele, -1);
        return solve(0, arr, true, dp);
    }
}