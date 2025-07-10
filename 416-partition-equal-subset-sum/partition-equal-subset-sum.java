class Solution {
    public boolean solve(int idx, int sum, int target, int[] arr, Boolean[][] dp){
        if(sum == target) return true;
        if(idx >= arr.length || sum > target) return false;
        if(dp[idx][sum] != null) return dp[idx][sum];
        boolean take = solve(idx+1, sum+arr[idx], target, arr, dp);
        boolean notTake = solve(idx+1, sum, target, arr, dp);
        return dp[idx][sum] = take || notTake;
    }
    public boolean canPartition(int[] arr) {
        int totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        if(totalSum % 2 != 0) return false;
        int target = totalSum/2;
        Boolean[][] dp = new Boolean[arr.length][target+1];
        return solve(0, 0, target, arr, dp);
    }
}