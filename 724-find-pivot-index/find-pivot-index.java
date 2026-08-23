class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int ele : nums){
            sum += ele;
        }
        int cummalativeSum = 0;
        for(int i=0;i<len;i++){
            int leftSum = cummalativeSum;
            int rightSum = sum - cummalativeSum - nums[i];
            if(leftSum == rightSum) return i;

            cummalativeSum += nums[i]; 
        }
        return -1;
    }
}