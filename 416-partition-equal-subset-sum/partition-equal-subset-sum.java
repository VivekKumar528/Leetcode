class Solution {
    public boolean solve(int idx, int[] arr, int target, Boolean[][] dp){
        if(idx == arr.length){
            if(target == 0) return true;
            else return false;
        }
        if(target < 0) return false;
        if(dp[idx][target] != null) return dp[idx][target];
        boolean notPick = solve(idx+1, arr, target, dp);
        boolean pick = solve(idx+1, arr, target-arr[idx], dp);
        return dp[idx][target] = pick || notPick;
    }
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for(int ele : arr) sum += ele;
        if(sum % 2 != 0) return false;
        Boolean[][] dp = new Boolean[arr.length+1][(sum/2) + 1];
        return solve(0, arr, sum/2, dp);
    }
}