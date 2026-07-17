class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int peak = 0;
        for(int i=0;i<len;i++){
            if(nums[i] > nums[(i+1)%len]) peak++;
        }
        return peak <= 1;
    }
}