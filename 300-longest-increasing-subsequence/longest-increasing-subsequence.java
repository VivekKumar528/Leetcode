class Solution {
    public int solve(int idx, int prevIdx, int[] arr, int[][] dp){
        if(idx >= arr.length) return 0;
        if(dp[idx][prevIdx+1] != -1) return dp[idx][prevIdx+1]; // prevIdx+1 bc of -1
        int take = 0;
        if(prevIdx == -1 || arr[idx] > arr[prevIdx]){
            take = 1 + solve(idx+1, idx, arr, dp);
        }
        int notTake = solve(idx+1, prevIdx, arr, dp);
        return dp[idx][prevIdx+1] = Math.max(take, notTake);
    }
    public int lengthOfLIS(int[] arr) {
        int[][] dp = new int[2501][2501];
        for(int[] ele : dp) Arrays.fill(ele, -1);
        return solve(0, -1, arr, dp);
    }
}