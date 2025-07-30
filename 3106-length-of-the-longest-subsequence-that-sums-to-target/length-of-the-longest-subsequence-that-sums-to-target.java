class Solution {
    public int solve(int idx, List<Integer> arr, int target, int[][] dp){
        if(idx == arr.size()){
            if(target == 0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[idx][target] != -1) return dp[idx][target];
        int notTake = solve(idx+1, arr, target, dp);
        if(target - arr.get(idx) < 0) return dp[idx][target] = notTake;
        int tempTake = solve(idx+1, arr, target-arr.get(idx), dp);
        int take = (tempTake == Integer.MIN_VALUE) ? Integer.MIN_VALUE : 1 + solve(idx+1, arr, target-arr.get(idx), dp);
        return dp[idx][target] = Math.max(take, notTake);
    }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        int ans = solve(0, nums, target, dp);
        return ans == Integer.MIN_VALUE ? -1 : ans;
    }
}