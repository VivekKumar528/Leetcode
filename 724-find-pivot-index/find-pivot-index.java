class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            int leftSum = 0;
            int rightSum = 0;
            int j = 0;
            while(j < i) leftSum += nums[j++];
            j = i+1;
            while(j < len) rightSum += nums[j++];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}