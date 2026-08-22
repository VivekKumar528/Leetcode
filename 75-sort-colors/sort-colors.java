class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for(int ele : nums){
            if(ele == 0) zeroCount++;
            else if(ele == 1) oneCount++;
            else twoCount++;
        }
        int idx = 0;
        while(zeroCount --> 0) nums[idx++] = 0;
        while(oneCount --> 0) nums[idx++] = 1;
        while(twoCount --> 0) nums[idx++] = 2;

    }
}