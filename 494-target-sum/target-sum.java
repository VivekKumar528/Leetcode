class Solution {
    public int solve(int idx, int[] arr, int target){
        if(idx == arr.length){
            if(target == 0) return 1;
            else return 0;
        }
        int add = solve(idx+1, arr, target-arr[idx]);
        int sub = solve(idx+1, arr, target+arr[idx]);
        return add + sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0, nums, target);
    }
}