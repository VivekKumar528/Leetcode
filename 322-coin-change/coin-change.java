class Solution {
    public long solve(int idx, int[] coins, int amount, long[][] dp){
        if(idx == coins.length) {
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[idx][amount] != -1) return dp[idx][amount];
        long notTake = solve(idx+1, coins, amount, dp);
        if(amount - coins[idx] < 0) return dp[idx][amount] = notTake;
        long take = 1 + solve(idx, coins, amount-coins[idx], dp);
        return dp[idx][amount] = Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length+1][amount+1];
        for(long[] arr : dp) Arrays.fill(arr, -1);
        int ans = (int)solve(0, coins, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}