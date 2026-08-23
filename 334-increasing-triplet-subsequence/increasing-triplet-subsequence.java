class Solution {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            int third = nums[i];
            if(third <= first) first = third;
            else if(third <= second) second = third;
            else return true;
        }
        return false;
    }
}