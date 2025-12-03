class Solution {
    public int largestPerimeter(int[] nums) {
        int len = nums.length;
        if (len < 3)
            return 0;
        Arrays.sort(nums);
        for (int i = len - 3; i >= 0; i--) {
            if (nums[i] + nums[i+1] > nums[i+2]) {
                int perimeter =nums[i] + nums[i+1] + nums[i+2];
                return perimeter;
            }
        }
        return 0;
    }
}