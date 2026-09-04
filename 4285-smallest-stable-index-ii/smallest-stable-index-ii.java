class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = nums.length;

        int[] minFromIndex = new int[len];
        int minEle = Integer.MAX_VALUE;
        for(int i=len-1;i>=0;i--){
            minEle = Math.min(minEle, nums[i]);
            minFromIndex[i] = minEle;
        }

        int maxEle = Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            maxEle = Math.max(maxEle, nums[i]);

            if(maxEle - minFromIndex[i] <= k) return i;
        }
        return -1;
    }
}