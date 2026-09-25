class Solution {
    public int solve(int[] arr, int l, int r, int target){
        if(l > r) return -1;
        int mid = l + (r - l)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target) return solve(arr, l, mid-1, target);
        else return solve(arr, mid+1, r, target);
    }
    public int search(int[] nums, int target) {
        return solve(nums, 0, nums.length-1, target);
    }
}