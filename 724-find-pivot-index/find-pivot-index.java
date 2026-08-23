class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] cummalativeSum = new int[len];
        cummalativeSum[0] = nums[0];
        for(int i=1;i<len;i++){
            cummalativeSum[i] = cummalativeSum[i-1] + nums[i];
        }
        int totalSum = cummalativeSum[len-1];
        for(int i=0;i<len;i++){
            int leftSum = (i == 0) ? 0 : cummalativeSum[i-1];
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum) return i;
        }
        return -1;
    }
}