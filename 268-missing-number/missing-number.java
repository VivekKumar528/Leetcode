class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int totalSum =( len * (len+1) )/ 2;
        int sum = 0;
        for(int ele : nums) sum += ele;
        return totalSum - sum;
    }
}