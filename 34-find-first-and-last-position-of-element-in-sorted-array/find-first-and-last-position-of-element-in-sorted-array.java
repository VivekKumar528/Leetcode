class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int leftIdx = -1;
        int rightIdx = -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] >= target) right = mid -1;
            else left = mid+1;
            if(nums[mid] == target) leftIdx = mid;
        }
        left = 0; right = nums.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] <= target) left = mid+1;
            else right = mid-1;
            if(nums[mid] == target) rightIdx = mid;
        }
        ans[0] = leftIdx; ans[1] = rightIdx;
        return ans;
    }
}