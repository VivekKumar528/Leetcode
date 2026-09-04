class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;
        
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int x=0;x<=i;x++) max = Math.max(nums[x], max);
            for(int y=i;y<len;y++) min = Math.min(nums[y], min);
            if(max - min <= k) return i;
        }
        return -1;
        
    }
}