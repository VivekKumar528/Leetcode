class Solution {
    public int minimumAverageDifference(int[] nums) {
        int len = nums.length;

        long sum = 0;
        for(int ele : nums) sum += ele;
        long leftSum = 0;
        long rightSum = 0;

        long result = Integer.MAX_VALUE;
        int idx = -1;

        for(int i=0;i<len;i++){
            leftSum += nums[i];
            rightSum = sum - leftSum;

            int n1 = i + 1;
            int n2 = len-n1;
            long leftAvg = leftSum/n1;
            long rightAvg = (i == len-1)?0:rightSum/n2;

            long avg = Math.abs(leftAvg - rightAvg);
            if(result > avg){
                result = avg;
                idx = i;
            }
        }
        return idx;
    }
}