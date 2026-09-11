class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;

        int size = nums.length;

        int count = 0;

        for(int i=0;i<size;i++){
            if(nums[i] == 0){
                count++;
            } else count = 0;

            result += count;
        }
        return result;
    }
}