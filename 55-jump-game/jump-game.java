class Solution {
    public boolean canJump(int[] nums) {
        int idx = 0;
        int i = 0;
        while(i < nums.length){
            if(i > idx ) return false;
            idx = Math.max(idx, i+nums[i]);
            i++;
        }
        return true;
    }
}